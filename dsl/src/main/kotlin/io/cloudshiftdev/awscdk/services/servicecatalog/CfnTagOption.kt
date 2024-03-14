package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTagOption internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOption,
) : CfnResource(cdkObject), IInspectable {
  public open fun active(): Any? = unwrap(this).getActive()

  public open fun active(`value`: Boolean) {
    unwrap(this).setActive(`value`)
  }

  public open fun active(`value`: IResolvable) {
    unwrap(this).setActive(`value`.let(IResolvable::unwrap))
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun key(): String = unwrap(this).getKey()

  public open fun key(`value`: String) {
    unwrap(this).setKey(`value`)
  }

  public open fun `value`(): String = unwrap(this).getValue()

  public open fun `value`(`value`: String) {
    unwrap(this).setValue(`value`)
  }

  public interface Builder {
    public fun active(active: Boolean) {
    }

    public fun active(active: IResolvable) {
    }

    public fun key(key: String) {
    }

    public fun `value`(`value`: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.CfnTagOption.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnTagOption.Builder.create(scope, id)

    public override fun active(active: Boolean) {
      cdkBuilder.active(active)
    }

    public override fun active(active: IResolvable) {
      cdkBuilder.active(active.let(IResolvable::unwrap))
    }

    public override fun key(key: String) {
      cdkBuilder.key(key)
    }

    public override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnTagOption =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTagOption {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTagOption(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOption):
        CfnTagOption = CfnTagOption(cdkObject)

    internal fun unwrap(wrapped: CfnTagOption):
        software.amazon.awscdk.services.servicecatalog.CfnTagOption = wrapped.cdkObject
  }
}
