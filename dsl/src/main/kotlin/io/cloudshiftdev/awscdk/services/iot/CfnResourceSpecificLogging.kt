package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceSpecificLogging internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnResourceSpecificLogging,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrTargetId(): String = unwrap(this).getAttrTargetId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logLevel(): String = unwrap(this).getLogLevel()

  public open fun logLevel(`value`: String) {
    unwrap(this).setLogLevel(`value`)
  }

  public open fun targetName(): String = unwrap(this).getTargetName()

  public open fun targetName(`value`: String) {
    unwrap(this).setTargetName(`value`)
  }

  public open fun targetType(): String = unwrap(this).getTargetType()

  public open fun targetType(`value`: String) {
    unwrap(this).setTargetType(`value`)
  }

  public interface Builder {
    public fun logLevel(logLevel: String) {
    }

    public fun targetName(targetName: String) {
    }

    public fun targetType(targetType: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnResourceSpecificLogging.Builder =
        software.amazon.awscdk.services.iot.CfnResourceSpecificLogging.Builder.create(scope, id)

    public override fun logLevel(logLevel: String) {
      cdkBuilder.logLevel(logLevel)
    }

    public override fun targetName(targetName: String) {
      cdkBuilder.targetName(targetName)
    }

    public override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnResourceSpecificLogging =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceSpecificLogging {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceSpecificLogging(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnResourceSpecificLogging):
        CfnResourceSpecificLogging = CfnResourceSpecificLogging(cdkObject)

    internal fun unwrap(wrapped: CfnResourceSpecificLogging):
        software.amazon.awscdk.services.iot.CfnResourceSpecificLogging = wrapped.cdkObject
  }
}
