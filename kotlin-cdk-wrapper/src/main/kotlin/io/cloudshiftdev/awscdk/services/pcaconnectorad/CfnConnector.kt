@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a connector between AWS Private CA and an Active Directory.
 *
 * You must specify the private CA, directory ID, and security groups.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcaconnectorad.*;
 * CfnConnector cfnConnector = CfnConnector.Builder.create(this, "MyCfnConnector")
 * .certificateAuthorityArn("certificateAuthorityArn")
 * .directoryId("directoryId")
 * .vpcInformation(VpcInformationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build())
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html)
 */
public open class CfnConnector(
  cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnConnector,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectorProps,
  ) :
      this(software.amazon.awscdk.services.pcaconnectorad.CfnConnector(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConnectorProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConnectorProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) that was returned when you called
   * [CreateConnector](https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector.html)
   * .
   */
  public open fun attrConnectorArn(): String = unwrap(this).getAttrConnectorArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Resource Name (ARN) of the certificate authority being used.
   */
  public open fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

  /**
   * The Amazon Resource Name (ARN) of the certificate authority being used.
   */
  public open fun certificateAuthorityArn(`value`: String) {
    unwrap(this).setCertificateAuthorityArn(`value`)
  }

  /**
   * The identifier of the Active Directory.
   */
  public open fun directoryId(): String = unwrap(this).getDirectoryId()

  /**
   * The identifier of the Active Directory.
   */
  public open fun directoryId(`value`: String) {
    unwrap(this).setDirectoryId(`value`)
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
   * Metadata assigned to a connector consisting of a key-value pair.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Metadata assigned to a connector consisting of a key-value pair.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * Information of the VPC and security group(s) used with the connector.
   */
  public open fun vpcInformation(): Any = unwrap(this).getVpcInformation()

  /**
   * Information of the VPC and security group(s) used with the connector.
   */
  public open fun vpcInformation(`value`: IResolvable) {
    unwrap(this).setVpcInformation(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information of the VPC and security group(s) used with the connector.
   */
  public open fun vpcInformation(`value`: VpcInformationProperty) {
    unwrap(this).setVpcInformation(`value`.let(VpcInformationProperty.Companion::unwrap))
  }

  /**
   * Information of the VPC and security group(s) used with the connector.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e2cf8ac4f3f89fdabf0898b800f2d31e3fc356ec7a18dd166400722accbe0826")
  public open fun vpcInformation(`value`: VpcInformationProperty.Builder.() -> Unit): Unit =
      vpcInformation(VpcInformationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pcaconnectorad.CfnConnector].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the certificate authority being used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-certificateauthorityarn)
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the certificate authority
     * being used. 
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    /**
     * The identifier of the Active Directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-directoryid)
     * @param directoryId The identifier of the Active Directory. 
     */
    public fun directoryId(directoryId: String)

    /**
     * Metadata assigned to a connector consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-tags)
     * @param tags Metadata assigned to a connector consisting of a key-value pair. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * Information of the VPC and security group(s) used with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-vpcinformation)
     * @param vpcInformation Information of the VPC and security group(s) used with the connector. 
     */
    public fun vpcInformation(vpcInformation: IResolvable)

    /**
     * Information of the VPC and security group(s) used with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-vpcinformation)
     * @param vpcInformation Information of the VPC and security group(s) used with the connector. 
     */
    public fun vpcInformation(vpcInformation: VpcInformationProperty)

    /**
     * Information of the VPC and security group(s) used with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-vpcinformation)
     * @param vpcInformation Information of the VPC and security group(s) used with the connector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32df71517c442273d53d51243ad04fe59b3bad74e4a946944099697bd91f110b")
    public fun vpcInformation(vpcInformation: VpcInformationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcaconnectorad.CfnConnector.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnConnector.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the certificate authority being used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-certificateauthorityarn)
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the certificate authority
     * being used. 
     */
    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * The identifier of the Active Directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-directoryid)
     * @param directoryId The identifier of the Active Directory. 
     */
    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    /**
     * Metadata assigned to a connector consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-tags)
     * @param tags Metadata assigned to a connector consisting of a key-value pair. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * Information of the VPC and security group(s) used with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-vpcinformation)
     * @param vpcInformation Information of the VPC and security group(s) used with the connector. 
     */
    override fun vpcInformation(vpcInformation: IResolvable) {
      cdkBuilder.vpcInformation(vpcInformation.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information of the VPC and security group(s) used with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-vpcinformation)
     * @param vpcInformation Information of the VPC and security group(s) used with the connector. 
     */
    override fun vpcInformation(vpcInformation: VpcInformationProperty) {
      cdkBuilder.vpcInformation(vpcInformation.let(VpcInformationProperty.Companion::unwrap))
    }

    /**
     * Information of the VPC and security group(s) used with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-vpcinformation)
     * @param vpcInformation Information of the VPC and security group(s) used with the connector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32df71517c442273d53d51243ad04fe59b3bad74e4a946944099697bd91f110b")
    override fun vpcInformation(vpcInformation: VpcInformationProperty.Builder.() -> Unit): Unit =
        vpcInformation(VpcInformationProperty(vpcInformation))

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnConnector =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pcaconnectorad.CfnConnector.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnConnector):
        CfnConnector = CfnConnector(cdkObject)

    internal fun unwrap(wrapped: CfnConnector):
        software.amazon.awscdk.services.pcaconnectorad.CfnConnector = wrapped.cdkObject as
        software.amazon.awscdk.services.pcaconnectorad.CfnConnector
  }

  /**
   * Information about your VPC and security groups used with the connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcaconnectorad.*;
   * VpcInformationProperty vpcInformationProperty = VpcInformationProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-connector-vpcinformation.html)
   */
  public interface VpcInformationProperty {
    /**
     * The security groups used with the connector.
     *
     * You can use a maximum of 4 security groups with a connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-connector-vpcinformation.html#cfn-pcaconnectorad-connector-vpcinformation-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * A builder for [VpcInformationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The security groups used with the connector. 
       * You can use a maximum of 4 security groups with a connector.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The security groups used with the connector. 
       * You can use a maximum of 4 security groups with a connector.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty.builder()

      /**
       * @param securityGroupIds The security groups used with the connector. 
       * You can use a maximum of 4 security groups with a connector.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The security groups used with the connector. 
       * You can use a maximum of 4 security groups with a connector.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty,
    ) : CdkObject(cdkObject), VpcInformationProperty {
      /**
       * The security groups used with the connector.
       *
       * You can use a maximum of 4 security groups with a connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-connector-vpcinformation.html#cfn-pcaconnectorad-connector-vpcinformation-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcInformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty):
          VpcInformationProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcInformationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInformationProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty
    }
  }
}
