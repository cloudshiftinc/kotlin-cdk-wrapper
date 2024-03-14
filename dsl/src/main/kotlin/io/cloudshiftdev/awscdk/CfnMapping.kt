package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMapping internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnMapping,
) : CfnRefElement(cdkObject) {
  public open fun findInMap(key1: String, key2: String): String = unwrap(this).findInMap(key1, key2)

  public open fun findInMap(
    key1: String,
    key2: String,
    defaultValue: String,
  ): String = unwrap(this).findInMap(key1, key2, defaultValue)

  public open fun `value`(
    key1: String,
    key2: String,
    `value`: Any,
  ) {
    unwrap(this).setValue(key1, key2, `value`)
  }

  public interface Builder {
    public fun lazy(lazy: Boolean) {
    }

    public fun mapping(mapping: Map<String, Map<String, Any>>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnMapping.Builder =
        software.amazon.awscdk.CfnMapping.Builder.create(scope, id)

    public override fun lazy(lazy: Boolean) {
      cdkBuilder.lazy(lazy)
    }

    public override fun mapping(mapping: Map<String, Map<String, Any>>) {
      cdkBuilder.mapping(mapping)
    }

    public fun build(): software.amazon.awscdk.CfnMapping = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnMapping): CfnMapping =
        CfnMapping(cdkObject)

    internal fun unwrap(wrapped: CfnMapping): software.amazon.awscdk.CfnMapping = wrapped.cdkObject
  }
}
