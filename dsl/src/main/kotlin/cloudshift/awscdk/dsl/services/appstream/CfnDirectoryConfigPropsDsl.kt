@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig
import software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps

@CdkDslMarker
public class CfnDirectoryConfigPropsDsl {
  private val cdkBuilder: CfnDirectoryConfigProps.Builder = CfnDirectoryConfigProps.builder()

  private val _organizationalUnitDistinguishedNames: MutableList<String> = mutableListOf()

  /**
   * @param certificateBasedAuthProperties The certificate-based authentication properties used to
   * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
   * streaming instances.
   */
  public fun certificateBasedAuthProperties(certificateBasedAuthProperties: IResolvable) {
    cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties)
  }

  /**
   * @param certificateBasedAuthProperties The certificate-based authentication properties used to
   * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
   * streaming instances.
   */
  public
      fun certificateBasedAuthProperties(certificateBasedAuthProperties: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty) {
    cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties)
  }

  /**
   * @param directoryName The fully qualified name of the directory (for example, corp.example.com).
   * 
   */
  public fun directoryName(directoryName: String) {
    cdkBuilder.directoryName(directoryName)
  }

  /**
   * @param organizationalUnitDistinguishedNames The distinguished names of the organizational units
   * for computer accounts. 
   */
  public fun organizationalUnitDistinguishedNames(vararg
      organizationalUnitDistinguishedNames: String) {
    _organizationalUnitDistinguishedNames.addAll(listOf(*organizationalUnitDistinguishedNames))
  }

  /**
   * @param organizationalUnitDistinguishedNames The distinguished names of the organizational units
   * for computer accounts. 
   */
  public
      fun organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames: Collection<String>) {
    _organizationalUnitDistinguishedNames.addAll(organizationalUnitDistinguishedNames)
  }

  /**
   * @param serviceAccountCredentials The credentials for the service account used by the streaming
   * instance to connect to the directory. 
   * Do not use this parameter directly. Use `ServiceAccountCredentials` as an input parameter with
   * `noEcho` as shown in the
   * [Parameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html)
   * . For best practices information, see [Do Not Embed Credentials in Your
   * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
   * .
   */
  public fun serviceAccountCredentials(serviceAccountCredentials: IResolvable) {
    cdkBuilder.serviceAccountCredentials(serviceAccountCredentials)
  }

  /**
   * @param serviceAccountCredentials The credentials for the service account used by the streaming
   * instance to connect to the directory. 
   * Do not use this parameter directly. Use `ServiceAccountCredentials` as an input parameter with
   * `noEcho` as shown in the
   * [Parameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html)
   * . For best practices information, see [Do Not Embed Credentials in Your
   * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
   * .
   */
  public
      fun serviceAccountCredentials(serviceAccountCredentials: CfnDirectoryConfig.ServiceAccountCredentialsProperty) {
    cdkBuilder.serviceAccountCredentials(serviceAccountCredentials)
  }

  public fun build(): CfnDirectoryConfigProps {
    if(_organizationalUnitDistinguishedNames.isNotEmpty())
        cdkBuilder.organizationalUnitDistinguishedNames(_organizationalUnitDistinguishedNames)
    return cdkBuilder.build()
  }
}
