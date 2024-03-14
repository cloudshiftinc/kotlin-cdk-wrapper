package io.cloudshiftdev.awscdk.services.pinpoint

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

public open class CfnEmailChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailChannel,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun configurationSet(): String? = unwrap(this).getConfigurationSet()

  public open fun configurationSet(`value`: String) {
    unwrap(this).setConfigurationSet(`value`)
  }

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun fromAddress(): String = unwrap(this).getFromAddress()

  public open fun fromAddress(`value`: String) {
    unwrap(this).setFromAddress(`value`)
  }

  public open fun identity(): String = unwrap(this).getIdentity()

  public open fun identity(`value`: String) {
    unwrap(this).setIdentity(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun configurationSet(configurationSet: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun fromAddress(fromAddress: String)

    public fun identity(identity: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnEmailChannel.Builder =
        software.amazon.awscdk.services.pinpoint.CfnEmailChannel.Builder.create(scope, id)

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun configurationSet(configurationSet: String) {
      cdkBuilder.configurationSet(configurationSet)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun fromAddress(fromAddress: String) {
      cdkBuilder.fromAddress(fromAddress)
    }

    override fun identity(identity: String) {
      cdkBuilder.identity(identity)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnEmailChannel =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEmailChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEmailChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailChannel):
        CfnEmailChannel = CfnEmailChannel(cdkObject)

    internal fun unwrap(wrapped: CfnEmailChannel):
        software.amazon.awscdk.services.pinpoint.CfnEmailChannel = wrapped.cdkObject
  }
}
