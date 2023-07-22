@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps

/**
 * Properties for defining a `CfnVerifiedAccessTrustProvider`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVerifiedAccessTrustProviderProps cfnVerifiedAccessTrustProviderProps =
 * CfnVerifiedAccessTrustProviderProps.builder()
 * .policyReferenceName("policyReferenceName")
 * .trustProviderType("trustProviderType")
 * // the properties below are optional
 * .description("description")
 * .deviceOptions(DeviceOptionsProperty.builder()
 * .tenantId("tenantId")
 * .build())
 * .deviceTrustProviderType("deviceTrustProviderType")
 * .oidcOptions(OidcOptionsProperty.builder()
 * .authorizationEndpoint("authorizationEndpoint")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .issuer("issuer")
 * .scope("scope")
 * .tokenEndpoint("tokenEndpoint")
 * .userInfoEndpoint("userInfoEndpoint")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userTrustProviderType("userTrustProviderType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html)
 */
@CdkDslMarker
public class CfnVerifiedAccessTrustProviderPropsDsl {
  private val cdkBuilder: CfnVerifiedAccessTrustProviderProps.Builder =
      CfnVerifiedAccessTrustProviderProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description A description for the AWS Verified Access trust provider.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param deviceOptions The options for device-identity trust provider.
   */
  public fun deviceOptions(deviceOptions: IResolvable) {
    cdkBuilder.deviceOptions(deviceOptions)
  }

  /**
   * @param deviceOptions The options for device-identity trust provider.
   */
  public fun deviceOptions(deviceOptions: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty) {
    cdkBuilder.deviceOptions(deviceOptions)
  }

  /**
   * @param deviceTrustProviderType The type of device-based trust provider.
   */
  public fun deviceTrustProviderType(deviceTrustProviderType: String) {
    cdkBuilder.deviceTrustProviderType(deviceTrustProviderType)
  }

  /**
   * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
   */
  public fun oidcOptions(oidcOptions: IResolvable) {
    cdkBuilder.oidcOptions(oidcOptions)
  }

  /**
   * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
   */
  public fun oidcOptions(oidcOptions: CfnVerifiedAccessTrustProvider.OidcOptionsProperty) {
    cdkBuilder.oidcOptions(oidcOptions)
  }

  /**
   * @param policyReferenceName The identifier to be used when working with policy rules. 
   */
  public fun policyReferenceName(policyReferenceName: String) {
    cdkBuilder.policyReferenceName(policyReferenceName)
  }

  /**
   * @param tags The tags.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param trustProviderType The type of Verified Access trust provider. 
   */
  public fun trustProviderType(trustProviderType: String) {
    cdkBuilder.trustProviderType(trustProviderType)
  }

  /**
   * @param userTrustProviderType The type of user-based trust provider.
   */
  public fun userTrustProviderType(userTrustProviderType: String) {
    cdkBuilder.userTrustProviderType(userTrustProviderType)
  }

  public fun build(): CfnVerifiedAccessTrustProviderProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
