@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnServicePrincipalName`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcaconnectorad.*;
 * CfnServicePrincipalNameProps cfnServicePrincipalNameProps =
 * CfnServicePrincipalNameProps.builder()
 * .connectorArn("connectorArn")
 * .directoryRegistrationArn("directoryRegistrationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html)
 */
public interface CfnServicePrincipalNameProps {
  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html#cfn-pcaconnectorad-serviceprincipalname-connectorarn)
   */
  public fun connectorArn(): String? = unwrap(this).getConnectorArn()

  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html#cfn-pcaconnectorad-serviceprincipalname-directoryregistrationarn)
   */
  public fun directoryRegistrationArn(): String? = unwrap(this).getDirectoryRegistrationArn()

  /**
   * A builder for [CfnServicePrincipalNameProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectorArn The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * .
     */
    public fun connectorArn(connectorArn: String)

    /**
     * @param directoryRegistrationArn The Amazon Resource Name (ARN) that was returned when you
     * called
     * [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
     * .
     */
    public fun directoryRegistrationArn(directoryRegistrationArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps.builder()

    /**
     * @param connectorArn The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * .
     */
    override fun connectorArn(connectorArn: String) {
      cdkBuilder.connectorArn(connectorArn)
    }

    /**
     * @param directoryRegistrationArn The Amazon Resource Name (ARN) that was returned when you
     * called
     * [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
     * .
     */
    override fun directoryRegistrationArn(directoryRegistrationArn: String) {
      cdkBuilder.directoryRegistrationArn(directoryRegistrationArn)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps,
  ) : CdkObject(cdkObject), CfnServicePrincipalNameProps {
    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html#cfn-pcaconnectorad-serviceprincipalname-connectorarn)
     */
    override fun connectorArn(): String? = unwrap(this).getConnectorArn()

    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html#cfn-pcaconnectorad-serviceprincipalname-directoryregistrationarn)
     */
    override fun directoryRegistrationArn(): String? = unwrap(this).getDirectoryRegistrationArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServicePrincipalNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps):
        CfnServicePrincipalNameProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServicePrincipalNameProps):
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalNameProps
  }
}
