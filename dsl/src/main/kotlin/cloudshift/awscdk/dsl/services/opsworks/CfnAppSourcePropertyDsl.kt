@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnApp

@CdkDslMarker
public class CfnAppSourcePropertyDsl {
  private val cdkBuilder: CfnApp.SourceProperty.Builder = CfnApp.SourceProperty.builder()

  /**
   * @param password When included in a request, the parameter depends on the repository type.
   * * For Amazon S3 bundles, set `Password` to the appropriate IAM secret access key.
   * * For HTTP bundles and Subversion repositories, set `Password` to the password.
   *
   * For more information on how to safely handle IAM credentials, see
   * [](https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html) .
   *
   * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param revision The application's version.
   * AWS OpsWorks Stacks enables you to easily deploy new versions of an application. One of the
   * simplest approaches is to have branches or revisions in your repository that represent different
   * versions that can potentially be deployed.
   */
  public fun revision(revision: String) {
    cdkBuilder.revision(revision)
  }

  /**
   * @param sshKey In requests, the repository's SSH key.
   * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
   */
  public fun sshKey(sshKey: String) {
    cdkBuilder.sshKey(sshKey)
  }

  /**
   * @param type The repository type.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param url The source URL.
   * The following is an example of an Amazon S3 source URL:
   * `https://s3.amazonaws.com/opsworks-demo-bucket/opsworks_cookbook_demo.tar.gz` .
   */
  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  /**
   * @param username This parameter depends on the repository type.
   * * For Amazon S3 bundles, set `Username` to the appropriate IAM access key ID.
   * * For HTTP bundles, Git repositories, and Subversion repositories, set `Username` to the user
   * name.
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnApp.SourceProperty = cdkBuilder.build()
}
