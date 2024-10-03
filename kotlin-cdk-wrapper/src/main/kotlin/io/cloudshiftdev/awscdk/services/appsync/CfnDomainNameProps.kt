@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnDomainName`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CfnDomainNameProps cfnDomainNameProps = CfnDomainNameProps.builder()
 * .certificateArn("certificateArn")
 * .domainName("domainName")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html)
 */
public interface CfnDomainNameProps {
  /**
   * The Amazon Resource Name (ARN) of the certificate.
   *
   * This will be an AWS Certificate Manager certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-certificatearn)
   */
  public fun certificateArn(): String

  /**
   * The decription for your domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-domainname)
   */
  public fun domainName(): String

  /**
   * A builder for [CfnDomainNameProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateArn The Amazon Resource Name (ARN) of the certificate. 
     * This will be an AWS Certificate Manager certificate.
     */
    public fun certificateArn(certificateArn: String)

    /**
     * @param description The decription for your domain name.
     */
    public fun description(description: String)

    /**
     * @param domainName The domain name. 
     */
    public fun domainName(domainName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnDomainNameProps.Builder =
        software.amazon.awscdk.services.appsync.CfnDomainNameProps.builder()

    /**
     * @param certificateArn The Amazon Resource Name (ARN) of the certificate. 
     * This will be an AWS Certificate Manager certificate.
     */
    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * @param description The decription for your domain name.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainName The domain name. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnDomainNameProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.CfnDomainNameProps,
  ) : CdkObject(cdkObject),
      CfnDomainNameProps {
    /**
     * The Amazon Resource Name (ARN) of the certificate.
     *
     * This will be an AWS Certificate Manager certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-certificatearn)
     */
    override fun certificateArn(): String = unwrap(this).getCertificateArn()

    /**
     * The decription for your domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html#cfn-appsync-domainname-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDomainNameProps):
        CfnDomainNameProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDomainNameProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameProps):
        software.amazon.awscdk.services.appsync.CfnDomainNameProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.CfnDomainNameProps
  }
}
