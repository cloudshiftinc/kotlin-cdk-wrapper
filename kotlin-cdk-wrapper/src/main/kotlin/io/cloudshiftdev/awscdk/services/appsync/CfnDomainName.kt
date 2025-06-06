@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppSync::DomainName` resource creates a `DomainNameConfig` object to configure a custom
 * domain.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CfnDomainName cfnDomainName = CfnDomainName.Builder.create(this, "MyCfnDomainName")
 * .certificateArn("certificateArn")
 * .domainName("domainName")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html)
 */
public open class CfnDomainName(
  cdkObject: software.amazon.awscdk.services.appsync.CfnDomainName,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainNameProps,
  ) :
      this(software.amazon.awscdk.services.appsync.CfnDomainName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDomainNameProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainNameProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDomainNameProps(props)
  )

  /**
   * The domain name provided by AWS AppSync .
   */
  public open fun attrAppSyncDomainName(): String = unwrap(this).getAttrAppSyncDomainName()

  /**
   * The domain name.
   */
  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  /**
   * The ID of your Amazon Route 53 hosted zone.
   */
  public open fun attrHostedZoneId(): String = unwrap(this).getAttrHostedZoneId()

  /**
   * The Amazon Resource Name (ARN) of the certificate.
   */
  public open fun certificateArn(): String = unwrap(this).getCertificateArn()

  /**
   * The Amazon Resource Name (ARN) of the certificate.
   */
  public open fun certificateArn(`value`: String) {
    unwrap(this).setCertificateArn(`value`)
  }

  /**
   * The decription for your domain name.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The decription for your domain name.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The domain name.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The domain name.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.CfnDomainName].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the certificate.
     *
     * This will be an AWS Certificate Manager certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-certificatearn)
     * @param certificateArn The Amazon Resource Name (ARN) of the certificate. 
     */
    public fun certificateArn(certificateArn: String)

    /**
     * The decription for your domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-description)
     * @param description The decription for your domain name. 
     */
    public fun description(description: String)

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-domainname)
     * @param domainName The domain name. 
     */
    public fun domainName(domainName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnDomainName.Builder =
        software.amazon.awscdk.services.appsync.CfnDomainName.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the certificate.
     *
     * This will be an AWS Certificate Manager certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-certificatearn)
     * @param certificateArn The Amazon Resource Name (ARN) of the certificate. 
     */
    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * The decription for your domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-description)
     * @param description The decription for your domain name. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-domainname)
     * @param domainName The domain name. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnDomainName = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appsync.CfnDomainName.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomainName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomainName(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDomainName):
        CfnDomainName = CfnDomainName(cdkObject)

    internal fun unwrap(wrapped: CfnDomainName):
        software.amazon.awscdk.services.appsync.CfnDomainName = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.CfnDomainName
  }
}
