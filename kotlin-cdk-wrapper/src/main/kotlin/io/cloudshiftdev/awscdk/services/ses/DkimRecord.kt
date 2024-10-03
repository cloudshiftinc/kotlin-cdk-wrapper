@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * A DKIM record.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * DkimRecord dkimRecord = DkimRecord.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 */
public interface DkimRecord {
  /**
   * The name of the record.
   */
  public fun name(): String

  /**
   * The value of the record.
   */
  public fun `value`(): String

  /**
   * A builder for [DkimRecord]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the record. 
     */
    public fun name(name: String)

    /**
     * @param value The value of the record. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.DkimRecord.Builder =
        software.amazon.awscdk.services.ses.DkimRecord.builder()

    /**
     * @param name The name of the record. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param value The value of the record. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.ses.DkimRecord = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.DkimRecord,
  ) : CdkObject(cdkObject),
      DkimRecord {
    /**
     * The name of the record.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The value of the record.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DkimRecord {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DkimRecord): DkimRecord =
        CdkObjectWrappers.wrap(cdkObject) as? DkimRecord ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DkimRecord): software.amazon.awscdk.services.ses.DkimRecord =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.DkimRecord
  }
}
