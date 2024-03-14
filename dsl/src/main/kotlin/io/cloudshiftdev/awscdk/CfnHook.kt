package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnHook internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnHook,
) : CfnElement(cdkObject) {
  public open fun type(): String = unwrap(this).getType()

  public interface Builder {
    public fun properties(properties: Map<String, Any>) {
    }

    public fun type(type: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnHook.Builder =
        software.amazon.awscdk.CfnHook.Builder.create(scope, id)

    public override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnHook = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHook {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHook(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnHook): CfnHook = CfnHook(cdkObject)

    internal fun unwrap(wrapped: CfnHook): software.amazon.awscdk.CfnHook = wrapped.cdkObject
  }
}
