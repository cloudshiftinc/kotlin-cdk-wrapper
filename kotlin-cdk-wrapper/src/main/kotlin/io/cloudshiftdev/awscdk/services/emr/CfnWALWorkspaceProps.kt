@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnWALWorkspace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emr.*;
 * CfnWALWorkspaceProps cfnWALWorkspaceProps = CfnWALWorkspaceProps.builder()
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .walWorkspaceName("walWorkspaceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html)
 */
public interface CfnWALWorkspaceProps {
  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the emrwal container.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-walworkspacename)
   */
  public fun walWorkspaceName(): String? = unwrap(this).getWalWorkspaceName()

  /**
   * A builder for [CfnWALWorkspaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param walWorkspaceName The name of the emrwal container.
     */
    public fun walWorkspaceName(walWorkspaceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnWALWorkspaceProps.Builder =
        software.amazon.awscdk.services.emr.CfnWALWorkspaceProps.builder()

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param walWorkspaceName The name of the emrwal container.
     */
    override fun walWorkspaceName(walWorkspaceName: String) {
      cdkBuilder.walWorkspaceName(walWorkspaceName)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnWALWorkspaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.emr.CfnWALWorkspaceProps,
  ) : CdkObject(cdkObject),
      CfnWALWorkspaceProps {
    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the emrwal container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-walworkspace.html#cfn-emr-walworkspace-walworkspacename)
     */
    override fun walWorkspaceName(): String? = unwrap(this).getWalWorkspaceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWALWorkspaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnWALWorkspaceProps):
        CfnWALWorkspaceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWALWorkspaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWALWorkspaceProps):
        software.amazon.awscdk.services.emr.CfnWALWorkspaceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.emr.CfnWALWorkspaceProps
  }
}
