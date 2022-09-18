# jerickrosa-test-aug-22



## Getting started

To make it easy for you to get started with GitLab, here's a list of recommended next steps.

Already a pro? Just edit this README.md and make it your own. Want to make it easy? [Use the template at the bottom](#editing-this-readme)!

## Add your files

- [ ] [Create](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#create-a-file) or [upload](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#upload-a-file) files
- [ ] [Add files using the command line](https://docs.gitlab.com/ee/gitlab-basics/add-file.html#add-a-file-using-the-command-line) or push an existing Git repository with the following command:

```
cd existing_repo
git remote add origin https://gitlab.com/applaudotest/jerickrosa-test-aug-22.git
git branch -M main
git push -uf origin main
```
## How to run it
- [ ] [Click on the com.appl directory ande select Run As...→ Sprin Boot App]
- [ ] [Open Postman application]
- [ ] [Select POST and paste this URL: http://localhost:8090/item. Click on Body, select Raw and paste:
{
"itemName":"EquipoDeRed",
"itemEnteredByUser":"Jerick Rosa",
"itemEnteredDate":"2022-08-28T04:44:40.400+00:00",
"itemBuyingPrice":"3400",
"itemSellingPrice":"2000",
"itemLastModifiedDate":"2022-08-28T04:44:40.400+00:00",
"itemLastModifiedByUser":"2022-08-28T04:44:40.400+00:00",
"itemStatus":"SOLD"
}
]
- [ ] [Open the web browser, type: http://localhost:8090/h2/ and hit Enter. Check the results]
- [ ] [Select GET and paste this URL: http://localhost:8090/item/1]
- [ ] [Open the web browser, type: http://localhost:8090/h2/ and hit Enter. Check the results]
- [ ] [Select PUT and paste this URL: /1. Click on Body, select Raw and paste:
{
"itemName": "EquipoDeImpresion",
"itemEnteredByUser": "John Doe",
"itemEnteredDate": "2022-08-28T04:44:40.400+00:00",
"itemBuyingPrice": 4000.0,
"itemSellingPrice": 3000.0,
"itemLastModifiedDate": "2022-08-28T04:44:40.400+00:00",
"itemLastModifiedByUser": "2022-08-28T04:44:40.400+00:00",
"itemStatus": "AVAILABLE"
}
]
- [ ] [Open the web browser, type: http://localhost:8090/h2/ and hit Enter. Check the results]
- [ ] [Select DELETE and paste this URL: http://localhost:8090/item/1]
- [ ] [Open the web browser, type: http://localhost:8090/h2/ and hit Enter. Check the results]

## Integrate with your tools

- [ ] [Set up project integrations](https://gitlab.com/applaudotest/jerickrosa-test-aug-22/-/settings/integrations)

## Collaborate with your team

- [ ] [Invite team members and collaborators](https://docs.gitlab.com/ee/user/project/members/)
- [ ] [Create a new merge request](https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html)
- [ ] [Automatically close issues from merge requests](https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)
- [ ] [Enable merge request approvals](https://docs.gitlab.com/ee/user/project/merge_requests/approvals/)
- [ ] [Automatically merge when pipeline succeeds](https://docs.gitlab.com/ee/user/project/merge_requests/merge_when_pipeline_succeeds.html)

## Test and Deploy

Use the built-in continuous integration in GitLab.

- [ ] [Get started with GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/index.html)
- [ ] [Analyze your code for known vulnerabilities with Static Application Security Testing(SAST)](https://docs.gitlab.com/ee/user/application_security/sast/)
- [ ] [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
- [ ] [Use pull-based deployments for improved Kubernetes management](https://docs.gitlab.com/ee/user/clusters/agent/)
- [ ] [Set up protected environments](https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***


