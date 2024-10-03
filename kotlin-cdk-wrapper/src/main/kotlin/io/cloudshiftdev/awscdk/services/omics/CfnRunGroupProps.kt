@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnRunGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * CfnRunGroupProps cfnRunGroupProps = CfnRunGroupProps.builder()
 * .maxCpus(123)
 * .maxDuration(123)
 * .maxGpus(123)
 * .maxRuns(123)
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html)
 */
public interface CfnRunGroupProps {
  /**
   * The group's maximum CPU count setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxcpus)
   */
  public fun maxCpus(): Number? = unwrap(this).getMaxCpus()

  /**
   * The group's maximum duration setting in minutes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxduration)
   */
  public fun maxDuration(): Number? = unwrap(this).getMaxDuration()

  /**
   * The maximum GPUs that can be used by a run group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxgpus)
   */
  public fun maxGpus(): Number? = unwrap(this).getMaxGpus()

  /**
   * The group's maximum concurrent run setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxruns)
   */
  public fun maxRuns(): Number? = unwrap(this).getMaxRuns()

  /**
   * The group's name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Tags for the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnRunGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxCpus The group's maximum CPU count setting.
     */
    public fun maxCpus(maxCpus: Number)

    /**
     * @param maxDuration The group's maximum duration setting in minutes.
     */
    public fun maxDuration(maxDuration: Number)

    /**
     * @param maxGpus The maximum GPUs that can be used by a run group.
     */
    public fun maxGpus(maxGpus: Number)

    /**
     * @param maxRuns The group's maximum concurrent run setting.
     */
    public fun maxRuns(maxRuns: Number)

    /**
     * @param name The group's name.
     */
    public fun name(name: String)

    /**
     * @param tags Tags for the group.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnRunGroupProps.Builder =
        software.amazon.awscdk.services.omics.CfnRunGroupProps.builder()

    /**
     * @param maxCpus The group's maximum CPU count setting.
     */
    override fun maxCpus(maxCpus: Number) {
      cdkBuilder.maxCpus(maxCpus)
    }

    /**
     * @param maxDuration The group's maximum duration setting in minutes.
     */
    override fun maxDuration(maxDuration: Number) {
      cdkBuilder.maxDuration(maxDuration)
    }

    /**
     * @param maxGpus The maximum GPUs that can be used by a run group.
     */
    override fun maxGpus(maxGpus: Number) {
      cdkBuilder.maxGpus(maxGpus)
    }

    /**
     * @param maxRuns The group's maximum concurrent run setting.
     */
    override fun maxRuns(maxRuns: Number) {
      cdkBuilder.maxRuns(maxRuns)
    }

    /**
     * @param name The group's name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Tags for the group.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnRunGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.omics.CfnRunGroupProps,
  ) : CdkObject(cdkObject),
      CfnRunGroupProps {
    /**
     * The group's maximum CPU count setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxcpus)
     */
    override fun maxCpus(): Number? = unwrap(this).getMaxCpus()

    /**
     * The group's maximum duration setting in minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxduration)
     */
    override fun maxDuration(): Number? = unwrap(this).getMaxDuration()

    /**
     * The maximum GPUs that can be used by a run group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxgpus)
     */
    override fun maxGpus(): Number? = unwrap(this).getMaxGpus()

    /**
     * The group's maximum concurrent run setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxruns)
     */
    override fun maxRuns(): Number? = unwrap(this).getMaxRuns()

    /**
     * The group's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Tags for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRunGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnRunGroupProps):
        CfnRunGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRunGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRunGroupProps):
        software.amazon.awscdk.services.omics.CfnRunGroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.omics.CfnRunGroupProps
  }
}
