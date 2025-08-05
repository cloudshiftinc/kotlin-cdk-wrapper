@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * This object defines one key that will be moved with the moveKey processor.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * MoveKeyEntryProperty moveKeyEntryProperty = MoveKeyEntryProperty.builder()
 * .source("source")
 * .target("target")
 * // the properties below are optional
 * .overwriteIfExists(false)
 * .build();
 * ```
 */
public interface MoveKeyEntryProperty {
  /**
   * Specifies whether to overwrite the value if the target key already exists.
   *
   * Default: false
   */
  public fun overwriteIfExists(): Boolean? = unwrap(this).getOverwriteIfExists()

  /**
   * The key to move.
   */
  public fun source(): String

  /**
   * The key to move to.
   */
  public fun target(): String

  /**
   * A builder for [MoveKeyEntryProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param overwriteIfExists Specifies whether to overwrite the value if the target key already
     * exists.
     */
    public fun overwriteIfExists(overwriteIfExists: Boolean)

    /**
     * @param source The key to move. 
     */
    public fun source(source: String)

    /**
     * @param target The key to move to. 
     */
    public fun target(target: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.MoveKeyEntryProperty.Builder =
        software.amazon.awscdk.services.logs.MoveKeyEntryProperty.builder()

    /**
     * @param overwriteIfExists Specifies whether to overwrite the value if the target key already
     * exists.
     */
    override fun overwriteIfExists(overwriteIfExists: Boolean) {
      cdkBuilder.overwriteIfExists(overwriteIfExists)
    }

    /**
     * @param source The key to move. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * @param target The key to move to. 
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    public fun build(): software.amazon.awscdk.services.logs.MoveKeyEntryProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.MoveKeyEntryProperty,
  ) : CdkObject(cdkObject),
      MoveKeyEntryProperty {
    /**
     * Specifies whether to overwrite the value if the target key already exists.
     *
     * Default: false
     */
    override fun overwriteIfExists(): Boolean? = unwrap(this).getOverwriteIfExists()

    /**
     * The key to move.
     */
    override fun source(): String = unwrap(this).getSource()

    /**
     * The key to move to.
     */
    override fun target(): String = unwrap(this).getTarget()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MoveKeyEntryProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.MoveKeyEntryProperty):
        MoveKeyEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? MoveKeyEntryProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MoveKeyEntryProperty):
        software.amazon.awscdk.services.logs.MoveKeyEntryProperty = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.MoveKeyEntryProperty
  }
}
