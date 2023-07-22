@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.alexa.ask

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.alexa.ask.CfnSkill

/**
 * The `SkillPackage` property type contains configuration details for the skill package that
 * contains the components of the Alexa skill.
 *
 * Skill packages are retrieved from an Amazon S3 bucket and key and used to create and update the
 * skill. More details about the skill package format are located in the  .
 *
 * `SkillPackage` is a property of the `Alexa::ASK::Skill` resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.alexa.ask.*;
 * Object manifest;
 * SkillPackageProperty skillPackageProperty = SkillPackageProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * // the properties below are optional
 * .overrides(OverridesProperty.builder()
 * .manifest(manifest)
 * .build())
 * .s3BucketRole("s3BucketRole")
 * .s3ObjectVersion("s3ObjectVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-skillpackage.html)
 */
@CdkDslMarker
public class CfnSkillSkillPackagePropertyDsl {
  private val cdkBuilder: CfnSkill.SkillPackageProperty.Builder =
      CfnSkill.SkillPackageProperty.builder()

  /**
   * @param overrides Overrides to the skill package to apply when creating or updating the skill.
   * Values provided here do not modify the contents of the original skill package. Currently, only
   * overriding values inside of the skill manifest component of the package is supported.
   */
  public fun overrides(overrides: IResolvable) {
    cdkBuilder.overrides(overrides)
  }

  /**
   * @param overrides Overrides to the skill package to apply when creating or updating the skill.
   * Values provided here do not modify the contents of the original skill package. Currently, only
   * overriding values inside of the skill manifest component of the package is supported.
   */
  public fun overrides(overrides: CfnSkill.OverridesProperty) {
    cdkBuilder.overrides(overrides)
  }

  /**
   * @param s3Bucket The name of the Amazon S3 bucket where the .zip file that contains the skill
   * package is stored. 
   */
  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  /**
   * @param s3BucketRole ARN of the IAM role that grants the Alexa service (
   * `alexa-appkit.amazon.com` ) permission to access the bucket and retrieve the skill package. This
   * property is optional. If you do not provide it, the bucket must be publicly accessible or
   * configured with a policy that allows this access. Otherwise, AWS CloudFormation cannot create the
   * skill.
   */
  public fun s3BucketRole(s3BucketRole: String) {
    cdkBuilder.s3BucketRole(s3BucketRole)
  }

  /**
   * @param s3Key The location and name of the skill package .zip file. 
   */
  public fun s3Key(s3Key: String) {
    cdkBuilder.s3Key(s3Key)
  }

  /**
   * @param s3ObjectVersion If you have S3 versioning enabled, the version ID of the skill
   * package.zip file.
   */
  public fun s3ObjectVersion(s3ObjectVersion: String) {
    cdkBuilder.s3ObjectVersion(s3ObjectVersion)
  }

  public fun build(): CfnSkill.SkillPackageProperty = cdkBuilder.build()
}
