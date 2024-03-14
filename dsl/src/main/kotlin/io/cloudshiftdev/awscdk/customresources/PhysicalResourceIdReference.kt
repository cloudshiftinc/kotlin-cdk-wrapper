package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.IResolveContext
import kotlin.Any
import kotlin.String
import kotlin.collections.List

public open class PhysicalResourceIdReference internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.customresources.PhysicalResourceIdReference,
) : CdkObject(cdkObject), IResolvable {
  /**
   * The creation stack of this resolvable which will be appended to errors thrown during
   * resolution.
   *
   * This may return an array with a single informational element indicating how
   * to get this property populated, if it was skipped for performance reasons.
   */
  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  /**
   * Produce the Token's value at resolution time.
   *
   * @param _context 
   */
  public override fun resolve(_context: IResolveContext): Any =
      unwrap(this).resolve(_context.let(IResolveContext::unwrap))

  /**
   * toJSON serialization to replace `PhysicalResourceIdReference` with a magic string.
   */
  public open fun toJson(): String = unwrap(this).toJSON()

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.customresources.PhysicalResourceIdReference):
        PhysicalResourceIdReference = PhysicalResourceIdReference(cdkObject)

    internal fun unwrap(wrapped: PhysicalResourceIdReference):
        software.amazon.awscdk.customresources.PhysicalResourceIdReference = wrapped.cdkObject
  }
}
