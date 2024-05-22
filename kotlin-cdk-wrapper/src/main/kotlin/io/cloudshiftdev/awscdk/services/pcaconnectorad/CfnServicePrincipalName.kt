@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a service principal name (SPN) for the service account in Active Directory.
 *
 * Kerberos authentication uses SPNs to associate a service instance with a service sign-in account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcaconnectorad.*;
 * CfnServicePrincipalName cfnServicePrincipalName = CfnServicePrincipalName.Builder.create(this,
 * "MyCfnServicePrincipalName")
 * .connectorArn("connectorArn")
 * .directoryRegistrationArn("directoryRegistrationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html)
 */
public open class CfnServicePrincipalName(
  cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServicePrincipalNameProps,
  ) :
      this(software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnServicePrincipalNameProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServicePrincipalNameProps.Builder.() -> Unit,
  ) : this(scope, id, CfnServicePrincipalNameProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
   * .
   */
  public open fun connectorArn(): String? = unwrap(this).getConnectorArn()

  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
   * .
   */
  public open fun connectorArn(`value`: String) {
    unwrap(this).setConnectorArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
   * .
   */
  public open fun directoryRegistrationArn(): String? = unwrap(this).getDirectoryRegistrationArn()

  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
   * .
   */
  public open fun directoryRegistrationArn(`value`: String) {
    unwrap(this).setDirectoryRegistrationArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pcaconnectorad.CfnServicePrincipalName].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html#cfn-pcaconnectorad-serviceprincipalname-connectorarn)
     * @param connectorArn The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * . 
     */
    public fun connectorArn(connectorArn: String)

    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html#cfn-pcaconnectorad-serviceprincipalname-directoryregistrationarn)
     * @param directoryRegistrationArn The Amazon Resource Name (ARN) that was returned when you
     * called
     * [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
     * . 
     */
    public fun directoryRegistrationArn(directoryRegistrationArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName.Builder.create(scope,
        id)

    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html#cfn-pcaconnectorad-serviceprincipalname-connectorarn)
     * @param connectorArn The Amazon Resource Name (ARN) that was returned when you called
     * [CreateConnector.html](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
     * . 
     */
    override fun connectorArn(connectorArn: String) {
      cdkBuilder.connectorArn(connectorArn)
    }

    /**
     * The Amazon Resource Name (ARN) that was returned when you called
     * [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-serviceprincipalname.html#cfn-pcaconnectorad-serviceprincipalname-directoryregistrationarn)
     * @param directoryRegistrationArn The Amazon Resource Name (ARN) that was returned when you
     * called
     * [CreateDirectoryRegistration](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration.html)
     * . 
     */
    override fun directoryRegistrationArn(directoryRegistrationArn: String) {
      cdkBuilder.directoryRegistrationArn(directoryRegistrationArn)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServicePrincipalName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServicePrincipalName(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName):
        CfnServicePrincipalName = CfnServicePrincipalName(cdkObject)

    internal fun unwrap(wrapped: CfnServicePrincipalName):
        software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName = wrapped.cdkObject
        as software.amazon.awscdk.services.pcaconnectorad.CfnServicePrincipalName
  }
}
