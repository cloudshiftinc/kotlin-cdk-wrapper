@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnOrganizationConformancePack
import software.constructs.Construct

@CdkDslMarker
public class CfnOrganizationConformancePackDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnOrganizationConformancePack.Builder =
      CfnOrganizationConformancePack.Builder.create(scope, id)

  private val _conformancePackInputParameters: MutableList<Any> = mutableListOf()

  private val _excludedAccounts: MutableList<String> = mutableListOf()

  /**
   * A list of `ConformancePackInputParameter` objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters)
   * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects. 
   */
  public fun conformancePackInputParameters(vararg conformancePackInputParameters: Any) {
    _conformancePackInputParameters.addAll(listOf(*conformancePackInputParameters))
  }

  /**
   * A list of `ConformancePackInputParameter` objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters)
   * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects. 
   */
  public fun conformancePackInputParameters(conformancePackInputParameters: Collection<Any>) {
    _conformancePackInputParameters.addAll(conformancePackInputParameters)
  }

  /**
   * A list of `ConformancePackInputParameter` objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-conformancepackinputparameters)
   * @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects. 
   */
  public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
    cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
  }

  /**
   * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
   *
   *
   * This field is optional.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3bucket)
   * @param deliveryS3Bucket The name of the Amazon S3 bucket where AWS Config stores conformance
   * pack templates. 
   */
  public fun deliveryS3Bucket(deliveryS3Bucket: String) {
    cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
  }

  /**
   * Any folder structure you want to add to an Amazon S3 bucket.
   *
   *
   * This field is optional.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-deliverys3keyprefix)
   * @param deliveryS3KeyPrefix Any folder structure you want to add to an Amazon S3 bucket. 
   */
  public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
    cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
  }

  /**
   * A comma-separated list of accounts excluded from organization conformance pack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-excludedaccounts)
   * @param excludedAccounts A comma-separated list of accounts excluded from organization
   * conformance pack. 
   */
  public fun excludedAccounts(vararg excludedAccounts: String) {
    _excludedAccounts.addAll(listOf(*excludedAccounts))
  }

  /**
   * A comma-separated list of accounts excluded from organization conformance pack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-excludedaccounts)
   * @param excludedAccounts A comma-separated list of accounts excluded from organization
   * conformance pack. 
   */
  public fun excludedAccounts(excludedAccounts: Collection<String>) {
    _excludedAccounts.addAll(excludedAccounts)
  }

  /**
   * The name you assign to an organization conformance pack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-organizationconformancepackname)
   * @param organizationConformancePackName The name you assign to an organization conformance pack.
   * 
   */
  public fun organizationConformancePackName(organizationConformancePackName: String) {
    cdkBuilder.organizationConformancePackName(organizationConformancePackName)
  }

  /**
   * A string containing full conformance pack template body.
   *
   * Structure containing the template body with a minimum length of 1 byte and a maximum length of
   * 51,200 bytes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templatebody)
   * @param templateBody A string containing full conformance pack template body. 
   */
  public fun templateBody(templateBody: String) {
    cdkBuilder.templateBody(templateBody)
  }

  /**
   * Location of file containing the template body.
   *
   * The uri must point to the conformance pack template (max size: 300 KB).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html#cfn-config-organizationconformancepack-templates3uri)
   * @param templateS3Uri Location of file containing the template body. 
   */
  public fun templateS3Uri(templateS3Uri: String) {
    cdkBuilder.templateS3Uri(templateS3Uri)
  }

  public fun build(): CfnOrganizationConformancePack {
    if(_conformancePackInputParameters.isNotEmpty())
        cdkBuilder.conformancePackInputParameters(_conformancePackInputParameters)
    if(_excludedAccounts.isNotEmpty()) cdkBuilder.excludedAccounts(_excludedAccounts)
    return cdkBuilder.build()
  }
}
