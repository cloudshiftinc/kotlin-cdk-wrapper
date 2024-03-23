@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnReadinessCheck`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53recoveryreadiness.*;
 * CfnReadinessCheckProps cfnReadinessCheckProps = CfnReadinessCheckProps.builder()
 * .readinessCheckName("readinessCheckName")
 * .resourceSetName("resourceSetName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html)
 */
public interface CfnReadinessCheckProps {
  /**
   * The name of the readiness check to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-readinesscheckname)
   */
  public fun readinessCheckName(): String? = unwrap(this).getReadinessCheckName()

  /**
   * The name of the resource set to check.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-resourcesetname)
   */
  public fun resourceSetName(): String? = unwrap(this).getResourceSetName()

  /**
   * A collection of tags associated with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnReadinessCheckProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param readinessCheckName The name of the readiness check to create.
     */
    public fun readinessCheckName(readinessCheckName: String)

    /**
     * @param resourceSetName The name of the resource set to check.
     */
    public fun resourceSetName(resourceSetName: String)

    /**
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps.builder()

    /**
     * @param readinessCheckName The name of the readiness check to create.
     */
    override fun readinessCheckName(readinessCheckName: String) {
      cdkBuilder.readinessCheckName(readinessCheckName)
    }

    /**
     * @param resourceSetName The name of the resource set to check.
     */
    override fun resourceSetName(resourceSetName: String) {
      cdkBuilder.resourceSetName(resourceSetName)
    }

    /**
     * @param tags A collection of tags associated with a resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A collection of tags associated with a resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps,
  ) : CdkObject(cdkObject), CfnReadinessCheckProps {
    /**
     * The name of the readiness check to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-readinesscheckname)
     */
    override fun readinessCheckName(): String? = unwrap(this).getReadinessCheckName()

    /**
     * The name of the resource set to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-resourcesetname)
     */
    override fun resourceSetName(): String? = unwrap(this).getResourceSetName()

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReadinessCheckProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps):
        CfnReadinessCheckProps = CdkObjectWrappers.wrap(cdkObject) as? CfnReadinessCheckProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReadinessCheckProps):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps
  }
}
