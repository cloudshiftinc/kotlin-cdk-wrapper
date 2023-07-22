@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * `RevisionLocation` is a property that defines the location of the CodeDeploy application revision
 * to deploy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * RevisionLocationProperty revisionLocationProperty = RevisionLocationProperty.builder()
 * .gitHubLocation(GitHubLocationProperty.builder()
 * .commitId("commitId")
 * .repository("repository")
 * .build())
 * .revisionType("revisionType")
 * .s3Location(S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .bundleType("bundleType")
 * .eTag("eTag")
 * .version("version")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-revisionlocation.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupRevisionLocationPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.RevisionLocationProperty.Builder =
      CfnDeploymentGroup.RevisionLocationProperty.builder()

  /**
   * @param gitHubLocation Information about the location of application artifacts stored in GitHub.
   */
  public fun gitHubLocation(gitHubLocation: IResolvable) {
    cdkBuilder.gitHubLocation(gitHubLocation)
  }

  /**
   * @param gitHubLocation Information about the location of application artifacts stored in GitHub.
   */
  public fun gitHubLocation(gitHubLocation: CfnDeploymentGroup.GitHubLocationProperty) {
    cdkBuilder.gitHubLocation(gitHubLocation)
  }

  /**
   * @param revisionType The type of application revision:.
   * * S3: An application revision stored in Amazon S3.
   * * GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
   * * String: A YAML-formatted or JSON-formatted string ( AWS Lambda deployments only).
   * * AppSpecContent: An `AppSpecContent` object that contains the contents of an AppSpec file for
   * an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or YAML stored as a
   * RawString.
   */
  public fun revisionType(revisionType: String) {
    cdkBuilder.revisionType(revisionType)
  }

  /**
   * @param s3Location Information about the location of a revision stored in Amazon S3.
   */
  public fun s3Location(s3Location: IResolvable) {
    cdkBuilder.s3Location(s3Location)
  }

  /**
   * @param s3Location Information about the location of a revision stored in Amazon S3.
   */
  public fun s3Location(s3Location: CfnDeploymentGroup.S3LocationProperty) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun build(): CfnDeploymentGroup.RevisionLocationProperty = cdkBuilder.build()
}
