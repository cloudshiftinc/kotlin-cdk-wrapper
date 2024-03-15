@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backupgateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents the hypervisor's permissions to which the gateway will connect.
 *
 * A hypervisor is hardware, software, or firmware that creates and manages virtual machines, and
 * allocates resources to them.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backupgateway.*;
 * CfnHypervisor cfnHypervisor = CfnHypervisor.Builder.create(this, "MyCfnHypervisor")
 * .host("host")
 * .kmsKeyArn("kmsKeyArn")
 * .logGroupArn("logGroupArn")
 * .name("name")
 * .password("password")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html)
 */
public open class CfnHypervisor internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.backupgateway.CfnHypervisor,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns `HypervisorArn` , an Amazon Resource Name (ARN) that uniquely identifies a Hypervisor.
   *
   * For example: `arn:aws:backup-gateway:us-east-1:123456789012:hypervisor/hype-1234D67D`
   */
  public open fun attrHypervisorArn(): String = unwrap(this).getAttrHypervisorArn()

  /**
   * The server host of the hypervisor.
   */
  public open fun host(): String? = unwrap(this).getHost()

  /**
   * The server host of the hypervisor.
   */
  public open fun host(`value`: String) {
    unwrap(this).setHost(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS Key Management Service used to encrypt the
   * hypervisor.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The Amazon Resource Name (ARN) of the AWS Key Management Service used to encrypt the
   * hypervisor.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
   */
  public open fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

  /**
   * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
   */
  public open fun logGroupArn(`value`: String) {
    unwrap(this).setLogGroupArn(`value`)
  }

  /**
   * The name of the hypervisor.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the hypervisor.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The password for the hypervisor.
   */
  public open fun password(): String? = unwrap(this).getPassword()

  /**
   * The password for the hypervisor.
   */
  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags of the hypervisor configuration to import.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags of the hypervisor configuration to import.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags of the hypervisor configuration to import.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The username for the hypervisor.
   */
  public open fun username(): String? = unwrap(this).getUsername()

  /**
   * The username for the hypervisor.
   */
  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.backupgateway.CfnHypervisor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The server host of the hypervisor.
     *
     * This can be either an IP address or a fully-qualified domain name (FQDN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-host)
     * @param host The server host of the hypervisor. 
     */
    public fun host(host: String)

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service used to encrypt the
     * hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service used to
     * encrypt the hypervisor. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-loggrouparn)
     * @param logGroupArn The Amazon Resource Name (ARN) of the group of gateways within the
     * requested log. 
     */
    public fun logGroupArn(logGroupArn: String)

    /**
     * The name of the hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-name)
     * @param name The name of the hypervisor. 
     */
    public fun name(name: String)

    /**
     * The password for the hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-password)
     * @param password The password for the hypervisor. 
     */
    public fun password(password: String)

    /**
     * The tags of the hypervisor configuration to import.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-tags)
     * @param tags The tags of the hypervisor configuration to import. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags of the hypervisor configuration to import.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-tags)
     * @param tags The tags of the hypervisor configuration to import. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The username for the hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-username)
     * @param username The username for the hypervisor. 
     */
    public fun username(username: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backupgateway.CfnHypervisor.Builder =
        software.amazon.awscdk.services.backupgateway.CfnHypervisor.Builder.create(scope, id)

    /**
     * The server host of the hypervisor.
     *
     * This can be either an IP address or a fully-qualified domain name (FQDN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-host)
     * @param host The server host of the hypervisor. 
     */
    override fun host(host: String) {
      cdkBuilder.host(host)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service used to encrypt the
     * hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service used to
     * encrypt the hypervisor. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-loggrouparn)
     * @param logGroupArn The Amazon Resource Name (ARN) of the group of gateways within the
     * requested log. 
     */
    override fun logGroupArn(logGroupArn: String) {
      cdkBuilder.logGroupArn(logGroupArn)
    }

    /**
     * The name of the hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-name)
     * @param name The name of the hypervisor. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The password for the hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-password)
     * @param password The password for the hypervisor. 
     */
    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    /**
     * The tags of the hypervisor configuration to import.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-tags)
     * @param tags The tags of the hypervisor configuration to import. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags of the hypervisor configuration to import.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-tags)
     * @param tags The tags of the hypervisor configuration to import. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The username for the hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-username)
     * @param username The username for the hypervisor. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.backupgateway.CfnHypervisor =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.backupgateway.CfnHypervisor.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHypervisor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHypervisor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backupgateway.CfnHypervisor):
        CfnHypervisor = CfnHypervisor(cdkObject)

    internal fun unwrap(wrapped: CfnHypervisor):
        software.amazon.awscdk.services.backupgateway.CfnHypervisor = wrapped.cdkObject
  }
}
