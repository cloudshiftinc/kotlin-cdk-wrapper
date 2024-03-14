package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserPoolUser internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUser,
) : CfnResource(cdkObject), IInspectable {
  public open fun clientMetadata(): Any? = unwrap(this).getClientMetadata()

  public open fun clientMetadata(`value`: IResolvable) {
    unwrap(this).setClientMetadata(`value`.let(IResolvable::unwrap))
  }

  public open fun clientMetadata(`value`: Map<String, String>) {
    unwrap(this).setClientMetadata(`value`)
  }

  public open fun desiredDeliveryMediums(): List<String> = unwrap(this).getDesiredDeliveryMediums()
      ?: emptyList()

  public open fun desiredDeliveryMediums(`value`: List<String>) {
    unwrap(this).setDesiredDeliveryMediums(`value`)
  }

  public open fun desiredDeliveryMediums(vararg `value`: String): Unit =
      desiredDeliveryMediums(`value`.toList())

  public open fun forceAliasCreation(): Any? = unwrap(this).getForceAliasCreation()

  public open fun forceAliasCreation(`value`: Boolean) {
    unwrap(this).setForceAliasCreation(`value`)
  }

  public open fun forceAliasCreation(`value`: IResolvable) {
    unwrap(this).setForceAliasCreation(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun messageAction(): String? = unwrap(this).getMessageAction()

  public open fun messageAction(`value`: String) {
    unwrap(this).setMessageAction(`value`)
  }

  public open fun userAttributes(): Any? = unwrap(this).getUserAttributes()

  public open fun userAttributes(`value`: IResolvable) {
    unwrap(this).setUserAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun userAttributes(__idx_ac66f0: List<Any>) {
    unwrap(this).setUserAttributes(__idx_ac66f0)
  }

  public open fun userAttributes(vararg __idx_ac66f0: Any): Unit =
      userAttributes(__idx_ac66f0.toList())

  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  public open fun username(): String? = unwrap(this).getUsername()

  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  public open fun validationData(): Any? = unwrap(this).getValidationData()

  public open fun validationData(`value`: IResolvable) {
    unwrap(this).setValidationData(`value`.let(IResolvable::unwrap))
  }

  public open fun validationData(__idx_ac66f0: List<Any>) {
    unwrap(this).setValidationData(__idx_ac66f0)
  }

  public open fun validationData(vararg __idx_ac66f0: Any): Unit =
      validationData(__idx_ac66f0.toList())

  public interface Builder {
    public fun clientMetadata(clientMetadata: IResolvable)

    public fun clientMetadata(clientMetadata: Map<String, String>)

    public fun desiredDeliveryMediums(desiredDeliveryMediums: List<String>)

    public fun desiredDeliveryMediums(vararg desiredDeliveryMediums: String)

    public fun forceAliasCreation(forceAliasCreation: Boolean)

    public fun forceAliasCreation(forceAliasCreation: IResolvable)

    public fun messageAction(messageAction: String)

    public fun userAttributes(userAttributes: IResolvable)

    public fun userAttributes(userAttributes: List<Any>)

    public fun userAttributes(vararg userAttributes: Any)

    public fun userPoolId(userPoolId: String)

    public fun username(username: String)

    public fun validationData(validationData: IResolvable)

    public fun validationData(validationData: List<Any>)

    public fun validationData(vararg validationData: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolUser.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolUser.Builder.create(scope, id)

    override fun clientMetadata(clientMetadata: IResolvable) {
      cdkBuilder.clientMetadata(clientMetadata.let(IResolvable::unwrap))
    }

    override fun clientMetadata(clientMetadata: Map<String, String>) {
      cdkBuilder.clientMetadata(clientMetadata)
    }

    override fun desiredDeliveryMediums(desiredDeliveryMediums: List<String>) {
      cdkBuilder.desiredDeliveryMediums(desiredDeliveryMediums)
    }

    override fun desiredDeliveryMediums(vararg desiredDeliveryMediums: String): Unit =
        desiredDeliveryMediums(desiredDeliveryMediums.toList())

    override fun forceAliasCreation(forceAliasCreation: Boolean) {
      cdkBuilder.forceAliasCreation(forceAliasCreation)
    }

    override fun forceAliasCreation(forceAliasCreation: IResolvable) {
      cdkBuilder.forceAliasCreation(forceAliasCreation.let(IResolvable::unwrap))
    }

    override fun messageAction(messageAction: String) {
      cdkBuilder.messageAction(messageAction)
    }

    override fun userAttributes(userAttributes: IResolvable) {
      cdkBuilder.userAttributes(userAttributes.let(IResolvable::unwrap))
    }

    override fun userAttributes(userAttributes: List<Any>) {
      cdkBuilder.userAttributes(userAttributes)
    }

    override fun userAttributes(vararg userAttributes: Any): Unit =
        userAttributes(userAttributes.toList())

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    override fun validationData(validationData: IResolvable) {
      cdkBuilder.validationData(validationData.let(IResolvable::unwrap))
    }

    override fun validationData(validationData: List<Any>) {
      cdkBuilder.validationData(validationData)
    }

    override fun validationData(vararg validationData: Any): Unit =
        validationData(validationData.toList())

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolUser = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolUser {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolUser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUser):
        CfnUserPoolUser = CfnUserPoolUser(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolUser):
        software.amazon.awscdk.services.cognito.CfnUserPoolUser = wrapped.cdkObject
  }

  public interface AttributeTypeProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty,
    ) : AttributeTypeProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty):
          AttributeTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
