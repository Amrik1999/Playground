#include <stdio.h>
#include<stdlib.h>
struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
}; /*typedef struct Node nd;*/
struct Node* root=NULL;

struct Node *newnode(int x) {
    struct Node* node = (struct Node*)malloc(sizeof(struct Node*));
    node->data = x;
    node->left = NULL;
    node->right = NULL;
    return node;
}
struct Node* makebst(int a[], int l, int r) 
{
   //your code here
  int mid;
  if(l>r)
    return NULL;
  
    mid=(l+r)/2;
    struct Node *root=newnode(a[mid]);
    root->left= makebst(a,l,mid-1);
    root->right=makebst(a,mid+1,r);
    return root;
 
}
void preorder(struct Node* root) {
    if(!root) return;
    printf("%d ",root->data);
    preorder(root->left);
    preorder(root->right);
}
int main()
 {
	int t,n,i;
	scanf("%d",&t);
	while(t--) 
    {
	    scanf("%d",&n);
	    int a[n];
	    for(i=0; i<n; i++)
	        scanf("%d",&a[i]);
	    
	        root = makebst(a,0,n-1);
	    preorder(root);
      printf("\n");
	}
  return 0;
}