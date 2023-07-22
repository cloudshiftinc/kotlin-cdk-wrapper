@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnDomain
import software.constructs.Construct

@CdkDslMarker
public class CfnDomainDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

  private val _autoSubDomainCreationPatterns: MutableList<String> = mutableListOf()

  private val _subDomainSettings: MutableList<Any> = mutableListOf()

  /**
   * The unique ID for an Amplify app.
   *
   * *Length Constraints:* Minimum length of 1. Maximum length of 20.
   *
   * *Pattern:* d[a-z0-9]+
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-appid)
   * @param appId The unique ID for an Amplify app. 
   */
  public fun appId(appId: String) {
    cdkBuilder.appId(appId)
  }

  /**
   * Sets the branch patterns for automatic subdomain creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomaincreationpatterns)
   * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain creation.
   * 
   */
  public fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String) {
    _autoSubDomainCreationPatterns.addAll(listOf(*autoSubDomainCreationPatterns))
  }

  /**
   * Sets the branch patterns for automatic subdomain creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomaincreationpatterns)
   * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain creation.
   * 
   */
  public fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: Collection<String>) {
    _autoSubDomainCreationPatterns.addAll(autoSubDomainCreationPatterns)
  }

  /**
   * The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name
   * (ARN) for automatically creating subdomains.
   *
   * *Length Constraints:* Maximum length of 1000.
   *
   * *Pattern:* ^$|^arn:aws:iam::\d{12}:role.+
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomainiamrole)
   * @param autoSubDomainIamRole The required AWS Identity and Access Management (IAM) service role
   * for the Amazon Resource Name (ARN) for automatically creating subdomains. 
   */
  public fun autoSubDomainIamRole(autoSubDomainIamRole: String) {
    cdkBuilder.autoSubDomainIamRole(autoSubDomainIamRole)
  }

  /**
   * The domain name for the domain association.
   *
   * *Length Constraints:* Maximum length of 255.
   *
   * *Pattern:* ^(((?!-)[A-Za-z0-9-]{0,62}[A-Za-z0-9]).)+((?!-)[A-Za-z0-9-]{1,62}[A-Za-z0-9])(.)?$
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-domainname)
   * @param domainName The domain name for the domain association. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * Enables the automated creation of subdomains for branches.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-enableautosubdomain)
   * @param enableAutoSubDomain Enables the automated creation of subdomains for branches. 
   */
  public fun enableAutoSubDomain(enableAutoSubDomain: Boolean) {
    cdkBuilder.enableAutoSubDomain(enableAutoSubDomain)
  }

  /**
   * Enables the automated creation of subdomains for branches.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-enableautosubdomain)
   * @param enableAutoSubDomain Enables the automated creation of subdomains for branches. 
   */
  public fun enableAutoSubDomain(enableAutoSubDomain: IResolvable) {
    cdkBuilder.enableAutoSubDomain(enableAutoSubDomain)
  }

  /**
   * The setting for the subdomain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
   * @param subDomainSettings The setting for the subdomain. 
   */
  public fun subDomainSettings(vararg subDomainSettings: Any) {
    _subDomainSettings.addAll(listOf(*subDomainSettings))
  }

  /**
   * The setting for the subdomain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
   * @param subDomainSettings The setting for the subdomain. 
   */
  public fun subDomainSettings(subDomainSettings: Collection<Any>) {
    _subDomainSettings.addAll(subDomainSettings)
  }

  /**
   * The setting for the subdomain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
   * @param subDomainSettings The setting for the subdomain. 
   */
  public fun subDomainSettings(subDomainSettings: IResolvable) {
    cdkBuilder.subDomainSettings(subDomainSettings)
  }

  public fun build(): CfnDomain {
    if(_autoSubDomainCreationPatterns.isNotEmpty())
        cdkBuilder.autoSubDomainCreationPatterns(_autoSubDomainCreationPatterns)
    if(_subDomainSettings.isNotEmpty()) cdkBuilder.subDomainSettings(_subDomainSettings)
    return cdkBuilder.build()
  }
}
