@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnUserPoolGroupProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun groupName(): String? = unwrap(this).getGroupName()

  public fun precedence(): Number? = unwrap(this).getPrecedence()

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun userPoolId(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun groupName(groupName: String)

    public fun precedence(precedence: Number)

    public fun roleArn(roleArn: String)

    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun precedence(precedence: Number) {
      cdkBuilder.precedence(precedence)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps,
  ) : CdkObject(cdkObject), CfnUserPoolGroupProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun groupName(): String? = unwrap(this).getGroupName()

    override fun precedence(): Number? = unwrap(this).getPrecedence()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps):
        CfnUserPoolGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolGroupProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps
  }
}
