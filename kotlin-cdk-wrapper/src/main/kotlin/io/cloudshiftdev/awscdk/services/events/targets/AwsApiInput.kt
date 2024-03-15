@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface AwsApiInput {
  public fun action(): String

  @Deprecated(message = "deprecated in CDK")
  public fun apiVersion(): String? = unwrap(this).getApiVersion()

  public fun catchErrorPattern(): String? = unwrap(this).getCatchErrorPattern()

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun service(): String

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    @Deprecated(message = "deprecated in CDK")
    public fun apiVersion(apiVersion: String)

    public fun catchErrorPattern(catchErrorPattern: String)

    public fun parameters(parameters: Any)

    public fun service(service: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.AwsApiInput.Builder =
        software.amazon.awscdk.services.events.targets.AwsApiInput.builder()

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun apiVersion(apiVersion: String) {
      cdkBuilder.apiVersion(apiVersion)
    }

    override fun catchErrorPattern(catchErrorPattern: String) {
      cdkBuilder.catchErrorPattern(catchErrorPattern)
    }

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.AwsApiInput =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.AwsApiInput,
  ) : CdkObject(cdkObject), AwsApiInput {
    override fun action(): String = unwrap(this).getAction()

    @Deprecated(message = "deprecated in CDK")
    override fun apiVersion(): String? = unwrap(this).getApiVersion()

    override fun catchErrorPattern(): String? = unwrap(this).getCatchErrorPattern()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun service(): String = unwrap(this).getService()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsApiInput {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.AwsApiInput):
        AwsApiInput = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsApiInput):
        software.amazon.awscdk.services.events.targets.AwsApiInput = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.AwsApiInput
  }
}
