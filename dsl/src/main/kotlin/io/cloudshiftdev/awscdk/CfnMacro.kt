package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMacro internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnMacro,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun functionName(): String = unwrap(this).getFunctionName()

  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logGroupName(): String? = unwrap(this).getLogGroupName()

  public open fun logGroupName(`value`: String) {
    unwrap(this).setLogGroupName(`value`)
  }

  public open fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

  public open fun logRoleArn(`value`: String) {
    unwrap(this).setLogRoleArn(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun functionName(functionName: String)

    public fun logGroupName(logGroupName: String)

    public fun logRoleArn(logRoleArn: String)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnMacro.Builder =
        software.amazon.awscdk.CfnMacro.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    override fun logRoleArn(logRoleArn: String) {
      cdkBuilder.logRoleArn(logRoleArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.CfnMacro = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMacro {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMacro(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnMacro): CfnMacro = CfnMacro(cdkObject)

    internal fun unwrap(wrapped: CfnMacro): software.amazon.awscdk.CfnMacro = wrapped.cdkObject
  }
}
