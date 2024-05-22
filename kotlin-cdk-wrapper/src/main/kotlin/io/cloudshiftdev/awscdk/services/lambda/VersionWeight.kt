@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * A version/weight pair for routing traffic to Lambda functions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Version version;
 * VersionWeight versionWeight = VersionWeight.builder()
 * .version(version)
 * .weight(123)
 * .build();
 * ```
 */
public interface VersionWeight {
  /**
   * The version to route traffic to.
   */
  public fun version(): IVersion

  /**
   * How much weight to assign to this version (0..1).
   */
  public fun weight(): Number

  /**
   * A builder for [VersionWeight]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The version to route traffic to. 
     */
    public fun version(version: IVersion)

    /**
     * @param weight How much weight to assign to this version (0..1). 
     */
    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.VersionWeight.Builder =
        software.amazon.awscdk.services.lambda.VersionWeight.builder()

    /**
     * @param version The version to route traffic to. 
     */
    override fun version(version: IVersion) {
      cdkBuilder.version(version.let(IVersion.Companion::unwrap))
    }

    /**
     * @param weight How much weight to assign to this version (0..1). 
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.lambda.VersionWeight = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.VersionWeight,
  ) : CdkObject(cdkObject), VersionWeight {
    /**
     * The version to route traffic to.
     */
    override fun version(): IVersion = unwrap(this).getVersion().let(IVersion::wrap)

    /**
     * How much weight to assign to this version (0..1).
     */
    override fun weight(): Number = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VersionWeight {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.VersionWeight):
        VersionWeight = CdkObjectWrappers.wrap(cdkObject) as? VersionWeight ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VersionWeight):
        software.amazon.awscdk.services.lambda.VersionWeight = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.VersionWeight
  }
}
