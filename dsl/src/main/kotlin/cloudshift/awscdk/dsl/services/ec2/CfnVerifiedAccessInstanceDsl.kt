@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance
import software.constructs.Construct

@CdkDslMarker
public class CfnVerifiedAccessInstanceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVerifiedAccessInstance.Builder =
      CfnVerifiedAccessInstance.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _verifiedAccessTrustProviderIds: MutableList<String> = mutableListOf()

  private val _verifiedAccessTrustProviders: MutableList<Any> = mutableListOf()

  /**
   * A description for the AWS Verified Access instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-description)
   * @param description A description for the AWS Verified Access instance. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The current logging configuration for the Verified Access instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-loggingconfigurations)
   * @param loggingConfigurations The current logging configuration for the Verified Access
   * instances. 
   */
  public fun loggingConfigurations(loggingConfigurations: IResolvable) {
    cdkBuilder.loggingConfigurations(loggingConfigurations)
  }

  /**
   * The current logging configuration for the Verified Access instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-loggingconfigurations)
   * @param loggingConfigurations The current logging configuration for the Verified Access
   * instances. 
   */
  public
      fun loggingConfigurations(loggingConfigurations: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty) {
    cdkBuilder.loggingConfigurations(loggingConfigurations)
  }

  /**
   * The tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-tags)
   * @param tags The tags. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-tags)
   * @param tags The tags. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The IDs of the AWS Verified Access trust providers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviderids)
   * @param verifiedAccessTrustProviderIds The IDs of the AWS Verified Access trust providers. 
   */
  public fun verifiedAccessTrustProviderIds(vararg verifiedAccessTrustProviderIds: String) {
    _verifiedAccessTrustProviderIds.addAll(listOf(*verifiedAccessTrustProviderIds))
  }

  /**
   * The IDs of the AWS Verified Access trust providers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviderids)
   * @param verifiedAccessTrustProviderIds The IDs of the AWS Verified Access trust providers. 
   */
  public fun verifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds: Collection<String>) {
    _verifiedAccessTrustProviderIds.addAll(verifiedAccessTrustProviderIds)
  }

  /**
   * The IDs of the AWS Verified Access trust providers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
   * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers. 
   */
  public fun verifiedAccessTrustProviders(vararg verifiedAccessTrustProviders: Any) {
    _verifiedAccessTrustProviders.addAll(listOf(*verifiedAccessTrustProviders))
  }

  /**
   * The IDs of the AWS Verified Access trust providers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
   * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers. 
   */
  public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: Collection<Any>) {
    _verifiedAccessTrustProviders.addAll(verifiedAccessTrustProviders)
  }

  /**
   * The IDs of the AWS Verified Access trust providers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessinstance.html#cfn-ec2-verifiedaccessinstance-verifiedaccesstrustproviders)
   * @param verifiedAccessTrustProviders The IDs of the AWS Verified Access trust providers. 
   */
  public fun verifiedAccessTrustProviders(verifiedAccessTrustProviders: IResolvable) {
    cdkBuilder.verifiedAccessTrustProviders(verifiedAccessTrustProviders)
  }

  public fun build(): CfnVerifiedAccessInstance {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_verifiedAccessTrustProviderIds.isNotEmpty())
        cdkBuilder.verifiedAccessTrustProviderIds(_verifiedAccessTrustProviderIds)
    if(_verifiedAccessTrustProviders.isNotEmpty())
        cdkBuilder.verifiedAccessTrustProviders(_verifiedAccessTrustProviders)
    return cdkBuilder.build()
  }
}
