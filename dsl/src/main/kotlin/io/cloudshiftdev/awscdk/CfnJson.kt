package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnJson internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnJson,
) : CloudshiftdevConstructsConstruct(cdkObject), IResolvable {
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
   * This is required in case someone JSON.stringifys an object which references this object.
   * Otherwise, we'll get a cyclic JSON reference.
   */
  public open fun toJson(): String = unwrap(this).toJSON()

  /**
   * An Fn::GetAtt to the JSON object passed through `value` and resolved during synthesis.
   *
   * Normally there is no need to use this property since `CfnJson` is an
   * IResolvable, so it can be simply used as a value.
   */
  public open fun `value`(): Reference = unwrap(this).getValue().let(Reference::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnJson].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The value to resolve.
     *
     * Can be any JavaScript object, including tokens and
     * references in keys or values.
     *
     * @param value The value to resolve. 
     */
    public fun `value`(`value`: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnJson.Builder =
        software.amazon.awscdk.CfnJson.Builder.create(scope, id)

    /**
     * The value to resolve.
     *
     * Can be any JavaScript object, including tokens and
     * references in keys or values.
     *
     * @param value The value to resolve. 
     */
    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.CfnJson = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJson {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJson(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnJson): CfnJson = CfnJson(cdkObject)

    internal fun unwrap(wrapped: CfnJson): software.amazon.awscdk.CfnJson = wrapped.cdkObject
  }
}
