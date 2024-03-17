@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.oam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnSink`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.oam.*;
 * Object policy;
 * CfnSinkProps cfnSinkProps = CfnSinkProps.builder()
 * .name("name")
 * // the properties below are optional
 * .policy(policy)
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html)
 */
public interface CfnSinkProps {
  /**
   * A name for the sink.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-name)
   */
  public fun name(): String

  /**
   * The IAM policy that grants permissions to source accounts to link to this sink.
   *
   * The policy can grant permission in the following ways:
   *
   * * Include organization IDs or organization paths to permit all accounts in an organization
   * * Include account IDs to permit the specified accounts
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-policy)
   */
  public fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * An array of key-value pairs to apply to the sink.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnSinkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name A name for the sink. 
     */
    public fun name(name: String)

    /**
     * @param policy The IAM policy that grants permissions to source accounts to link to this sink.
     * The policy can grant permission in the following ways:
     *
     * * Include organization IDs or organization paths to permit all accounts in an organization
     * * Include account IDs to permit the specified accounts
     */
    public fun policy(policy: Any)

    /**
     * @param tags An array of key-value pairs to apply to the sink.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.oam.CfnSinkProps.Builder =
        software.amazon.awscdk.services.oam.CfnSinkProps.builder()

    /**
     * @param name A name for the sink. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param policy The IAM policy that grants permissions to source accounts to link to this sink.
     * The policy can grant permission in the following ways:
     *
     * * Include organization IDs or organization paths to permit all accounts in an organization
     * * Include account IDs to permit the specified accounts
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param tags An array of key-value pairs to apply to the sink.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.oam.CfnSinkProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.oam.CfnSinkProps,
  ) : CdkObject(cdkObject), CfnSinkProps {
    /**
     * A name for the sink.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The IAM policy that grants permissions to source accounts to link to this sink.
     *
     * The policy can grant permission in the following ways:
     *
     * * Include organization IDs or organization paths to permit all accounts in an organization
     * * Include account IDs to permit the specified accounts
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-policy)
     */
    override fun policy(): Any? = unwrap(this).getPolicy()

    /**
     * An array of key-value pairs to apply to the sink.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html#cfn-oam-sink-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.oam.CfnSinkProps): CfnSinkProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnSinkProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSinkProps): software.amazon.awscdk.services.oam.CfnSinkProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.oam.CfnSinkProps
  }
}
