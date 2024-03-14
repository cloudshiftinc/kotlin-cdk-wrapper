package io.cloudshiftdev.awscdk.services.dax

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnParameterGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dax.CfnParameterGroup,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  public open fun parameterGroupName(`value`: String) {
    unwrap(this).setParameterGroupName(`value`)
  }

  public open fun parameterNameValues(): Any? = unwrap(this).getParameterNameValues()

  public open fun parameterNameValues(`value`: Any) {
    unwrap(this).setParameterNameValues(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun parameterGroupName(parameterGroupName: String)

    public fun parameterNameValues(parameterNameValues: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dax.CfnParameterGroup.Builder =
        software.amazon.awscdk.services.dax.CfnParameterGroup.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    override fun parameterNameValues(parameterNameValues: Any) {
      cdkBuilder.parameterNameValues(parameterNameValues)
    }

    public fun build(): software.amazon.awscdk.services.dax.CfnParameterGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dax.CfnParameterGroup):
        CfnParameterGroup = CfnParameterGroup(cdkObject)

    internal fun unwrap(wrapped: CfnParameterGroup):
        software.amazon.awscdk.services.dax.CfnParameterGroup = wrapped.cdkObject
  }
}
