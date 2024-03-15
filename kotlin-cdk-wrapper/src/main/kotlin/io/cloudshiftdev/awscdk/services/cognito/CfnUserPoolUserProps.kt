@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnUserPoolUserProps {
  public fun clientMetadata(): Any? = unwrap(this).getClientMetadata()

  public fun desiredDeliveryMediums(): List<String> = unwrap(this).getDesiredDeliveryMediums() ?:
      emptyList()

  public fun forceAliasCreation(): Any? = unwrap(this).getForceAliasCreation()

  public fun messageAction(): String? = unwrap(this).getMessageAction()

  public fun userAttributes(): Any? = unwrap(this).getUserAttributes()

  public fun userPoolId(): String

  public fun username(): String? = unwrap(this).getUsername()

  public fun validationData(): Any? = unwrap(this).getValidationData()

  @CdkDslMarker
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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.builder()

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

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolUserProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUserProps,
  ) : CdkObject(cdkObject), CfnUserPoolUserProps {
    override fun clientMetadata(): Any? = unwrap(this).getClientMetadata()

    override fun desiredDeliveryMediums(): List<String> = unwrap(this).getDesiredDeliveryMediums()
        ?: emptyList()

    override fun forceAliasCreation(): Any? = unwrap(this).getForceAliasCreation()

    override fun messageAction(): String? = unwrap(this).getMessageAction()

    override fun userAttributes(): Any? = unwrap(this).getUserAttributes()

    override fun userPoolId(): String = unwrap(this).getUserPoolId()

    override fun username(): String? = unwrap(this).getUsername()

    override fun validationData(): Any? = unwrap(this).getValidationData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUserProps):
        CfnUserPoolUserProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolUserProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolUserProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CfnUserPoolUserProps
  }
}
