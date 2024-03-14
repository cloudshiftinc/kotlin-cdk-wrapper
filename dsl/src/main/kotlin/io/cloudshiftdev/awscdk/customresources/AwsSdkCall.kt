package io.cloudshiftdev.awscdk.customresources

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AwsSdkCall {
  public fun action(): String

  public fun apiVersion(): String? = unwrap(this).getApiVersion()

  public fun assumedRoleArn(): String? = unwrap(this).getAssumedRoleArn()

  public fun ignoreErrorCodesMatching(): String? = unwrap(this).getIgnoreErrorCodesMatching()

  public fun outputPaths(): List<String> = unwrap(this).getOutputPaths() ?: emptyList()

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun physicalResourceId(): PhysicalResourceId? =
      unwrap(this).getPhysicalResourceId()?.let(PhysicalResourceId::wrap)

  public fun region(): String? = unwrap(this).getRegion()

  public fun service(): String

  public interface Builder {
    public fun action(action: String)

    public fun apiVersion(apiVersion: String)

    public fun assumedRoleArn(assumedRoleArn: String)

    public fun ignoreErrorCodesMatching(ignoreErrorCodesMatching: String)

    public fun outputPaths(outputPaths: List<String>)

    public fun outputPaths(vararg outputPaths: String)

    public fun parameters(parameters: Any)

    public fun physicalResourceId(physicalResourceId: PhysicalResourceId)

    public fun region(region: String)

    public fun service(service: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.AwsSdkCall.Builder =
        software.amazon.awscdk.customresources.AwsSdkCall.builder()

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun apiVersion(apiVersion: String) {
      cdkBuilder.apiVersion(apiVersion)
    }

    override fun assumedRoleArn(assumedRoleArn: String) {
      cdkBuilder.assumedRoleArn(assumedRoleArn)
    }

    override fun ignoreErrorCodesMatching(ignoreErrorCodesMatching: String) {
      cdkBuilder.ignoreErrorCodesMatching(ignoreErrorCodesMatching)
    }

    override fun outputPaths(outputPaths: List<String>) {
      cdkBuilder.outputPaths(outputPaths)
    }

    override fun outputPaths(vararg outputPaths: String): Unit = outputPaths(outputPaths.toList())

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun physicalResourceId(physicalResourceId: PhysicalResourceId) {
      cdkBuilder.physicalResourceId(physicalResourceId.let(PhysicalResourceId::unwrap))
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public fun build(): software.amazon.awscdk.customresources.AwsSdkCall = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.customresources.AwsSdkCall,
  ) : AwsSdkCall {
    override fun action(): String = unwrap(this).getAction()

    override fun apiVersion(): String? = unwrap(this).getApiVersion()

    override fun assumedRoleArn(): String? = unwrap(this).getAssumedRoleArn()

    override fun ignoreErrorCodesMatching(): String? = unwrap(this).getIgnoreErrorCodesMatching()

    override fun outputPaths(): List<String> = unwrap(this).getOutputPaths() ?: emptyList()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun physicalResourceId(): PhysicalResourceId? =
        unwrap(this).getPhysicalResourceId()?.let(PhysicalResourceId::wrap)

    override fun region(): String? = unwrap(this).getRegion()

    override fun service(): String = unwrap(this).getService()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AwsSdkCall {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.AwsSdkCall): AwsSdkCall =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsSdkCall): software.amazon.awscdk.customresources.AwsSdkCall =
        (wrapped as Wrapper).cdkObject
  }
}
