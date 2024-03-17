@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarconnections

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnConnection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codestarconnections.*;
 * CfnConnectionProps cfnConnectionProps = CfnConnectionProps.builder()
 * .connectionName("connectionName")
 * // the properties below are optional
 * .hostArn("hostArn")
 * .providerType("providerType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-connection.html)
 */
public interface CfnConnectionProps {
  /**
   * The name of the connection.
   *
   * Connection names must be unique in an AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-connection.html#cfn-codestarconnections-connection-connectionname)
   */
  public fun connectionName(): String

  /**
   * The Amazon Resource Name (ARN) of the host associated with the connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-connection.html#cfn-codestarconnections-connection-hostarn)
   */
  public fun hostArn(): String? = unwrap(this).getHostArn()

  /**
   * The name of the external provider where your third-party code repository is configured.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-connection.html#cfn-codestarconnections-connection-providertype)
   */
  public fun providerType(): String? = unwrap(this).getProviderType()

  /**
   * Specifies the tags applied to the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-connection.html#cfn-codestarconnections-connection-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionName The name of the connection. 
     * Connection names must be unique in an AWS account .
     */
    public fun connectionName(connectionName: String)

    /**
     * @param hostArn The Amazon Resource Name (ARN) of the host associated with the connection.
     */
    public fun hostArn(hostArn: String)

    /**
     * @param providerType The name of the external provider where your third-party code repository
     * is configured.
     */
    public fun providerType(providerType: String)

    /**
     * @param tags Specifies the tags applied to the resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies the tags applied to the resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarconnections.CfnConnectionProps.Builder =
        software.amazon.awscdk.services.codestarconnections.CfnConnectionProps.builder()

    /**
     * @param connectionName The name of the connection. 
     * Connection names must be unique in an AWS account .
     */
    override fun connectionName(connectionName: String) {
      cdkBuilder.connectionName(connectionName)
    }

    /**
     * @param hostArn The Amazon Resource Name (ARN) of the host associated with the connection.
     */
    override fun hostArn(hostArn: String) {
      cdkBuilder.hostArn(hostArn)
    }

    /**
     * @param providerType The name of the external provider where your third-party code repository
     * is configured.
     */
    override fun providerType(providerType: String) {
      cdkBuilder.providerType(providerType)
    }

    /**
     * @param tags Specifies the tags applied to the resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies the tags applied to the resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codestarconnections.CfnConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codestarconnections.CfnConnectionProps,
  ) : CdkObject(cdkObject), CfnConnectionProps {
    /**
     * The name of the connection.
     *
     * Connection names must be unique in an AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-connection.html#cfn-codestarconnections-connection-connectionname)
     */
    override fun connectionName(): String = unwrap(this).getConnectionName()

    /**
     * The Amazon Resource Name (ARN) of the host associated with the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-connection.html#cfn-codestarconnections-connection-hostarn)
     */
    override fun hostArn(): String? = unwrap(this).getHostArn()

    /**
     * The name of the external provider where your third-party code repository is configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-connection.html#cfn-codestarconnections-connection-providertype)
     */
    override fun providerType(): String? = unwrap(this).getProviderType()

    /**
     * Specifies the tags applied to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-connection.html#cfn-codestarconnections-connection-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarconnections.CfnConnectionProps):
        CfnConnectionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConnectionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionProps):
        software.amazon.awscdk.services.codestarconnections.CfnConnectionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarconnections.CfnConnectionProps
  }
}
