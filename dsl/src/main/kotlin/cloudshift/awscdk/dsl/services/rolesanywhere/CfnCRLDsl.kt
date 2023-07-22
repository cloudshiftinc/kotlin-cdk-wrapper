@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rolesanywhere

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rolesanywhere.CfnCRL
import software.constructs.Construct

@CdkDslMarker
public class CfnCRLDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCRL.Builder = CfnCRL.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The x509 v3 specified certificate revocation list (CRL).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-crldata)
   * @param crlData The x509 v3 specified certificate revocation list (CRL). 
   */
  public fun crlData(crlData: String) {
    cdkBuilder.crlData(crlData)
  }

  /**
   * Specifies whether the certificate revocation list (CRL) is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-enabled)
   * @param enabled Specifies whether the certificate revocation list (CRL) is enabled. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * Specifies whether the certificate revocation list (CRL) is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-enabled)
   * @param enabled Specifies whether the certificate revocation list (CRL) is enabled. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * The name of the certificate revocation list (CRL).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-name)
   * @param name The name of the certificate revocation list (CRL). 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * A list of tags to attach to the certificate revocation list (CRL).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-tags)
   * @param tags A list of tags to attach to the certificate revocation list (CRL). 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of tags to attach to the certificate revocation list (CRL).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-tags)
   * @param tags A list of tags to attach to the certificate revocation list (CRL). 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html#cfn-rolesanywhere-crl-trustanchorarn)
   * @param trustAnchorArn The ARN of the TrustAnchor the certificate revocation list (CRL) will
   * provide revocation for. 
   */
  public fun trustAnchorArn(trustAnchorArn: String) {
    cdkBuilder.trustAnchorArn(trustAnchorArn)
  }

  public fun build(): CfnCRL {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
