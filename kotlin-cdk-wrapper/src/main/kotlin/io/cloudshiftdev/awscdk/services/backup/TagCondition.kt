@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * A tag condition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * TagCondition tagCondition = TagCondition.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .operation(TagOperation.STRING_EQUALS)
 * .build();
 * ```
 */
public interface TagCondition {
  /**
   * The key in a key-value pair.
   *
   * For example, in `"ec2:ResourceTag/Department": "accounting"`,
   * `ec2:ResourceTag/Department` is the key.
   */
  public fun key(): String

  /**
   * An operation that is applied to a key-value pair used to filter resources in a selection.
   *
   * Default: STRING_EQUALS
   */
  public fun operation(): TagOperation? = unwrap(this).getOperation()?.let(TagOperation::wrap)

  /**
   * The value in a key-value pair.
   *
   * For example, in `"ec2:ResourceTag/Department": "accounting"`,
   * `accounting` is the value.
   */
  public fun `value`(): String

  /**
   * A builder for [TagCondition]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key The key in a key-value pair. 
     * For example, in `"ec2:ResourceTag/Department": "accounting"`,
     * `ec2:ResourceTag/Department` is the key.
     */
    public fun key(key: String)

    /**
     * @param operation An operation that is applied to a key-value pair used to filter resources in
     * a selection.
     */
    public fun operation(operation: TagOperation)

    /**
     * @param value The value in a key-value pair. 
     * For example, in `"ec2:ResourceTag/Department": "accounting"`,
     * `accounting` is the value.
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.TagCondition.Builder =
        software.amazon.awscdk.services.backup.TagCondition.builder()

    /**
     * @param key The key in a key-value pair. 
     * For example, in `"ec2:ResourceTag/Department": "accounting"`,
     * `ec2:ResourceTag/Department` is the key.
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param operation An operation that is applied to a key-value pair used to filter resources in
     * a selection.
     */
    override fun operation(operation: TagOperation) {
      cdkBuilder.operation(operation.let(TagOperation.Companion::unwrap))
    }

    /**
     * @param value The value in a key-value pair. 
     * For example, in `"ec2:ResourceTag/Department": "accounting"`,
     * `accounting` is the value.
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.backup.TagCondition = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.backup.TagCondition,
  ) : CdkObject(cdkObject),
      TagCondition {
    /**
     * The key in a key-value pair.
     *
     * For example, in `"ec2:ResourceTag/Department": "accounting"`,
     * `ec2:ResourceTag/Department` is the key.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * An operation that is applied to a key-value pair used to filter resources in a selection.
     *
     * Default: STRING_EQUALS
     */
    override fun operation(): TagOperation? = unwrap(this).getOperation()?.let(TagOperation::wrap)

    /**
     * The value in a key-value pair.
     *
     * For example, in `"ec2:ResourceTag/Department": "accounting"`,
     * `accounting` is the value.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TagCondition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.TagCondition): TagCondition
        = CdkObjectWrappers.wrap(cdkObject) as? TagCondition ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TagCondition): software.amazon.awscdk.services.backup.TagCondition
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.backup.TagCondition
  }
}
