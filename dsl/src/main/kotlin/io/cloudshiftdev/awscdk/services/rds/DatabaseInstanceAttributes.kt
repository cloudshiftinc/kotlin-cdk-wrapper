package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface DatabaseInstanceAttributes {
  public fun engine(): IInstanceEngine? = unwrap(this).getEngine()?.let(IInstanceEngine::wrap)

  public fun instanceEndpointAddress(): String

  public fun instanceIdentifier(): String

  public fun instanceResourceId(): String? = unwrap(this).getInstanceResourceId()

  public fun port(): Number

  public fun securityGroups(): List<ISecurityGroup>

  public interface Builder {
    public fun engine(engine: IInstanceEngine) {
    }

    public fun instanceEndpointAddress(instanceEndpointAddress: String) {
    }

    public fun instanceIdentifier(instanceIdentifier: String) {
    }

    public fun instanceResourceId(instanceResourceId: String) {
    }

    public fun port(port: Number) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseInstanceAttributes.Builder =
        software.amazon.awscdk.services.rds.DatabaseInstanceAttributes.builder()

    public override fun engine(engine: IInstanceEngine) {
      cdkBuilder.engine(engine.let(IInstanceEngine::unwrap))
    }

    public override fun instanceEndpointAddress(instanceEndpointAddress: String) {
      cdkBuilder.instanceEndpointAddress(instanceEndpointAddress)
    }

    public override fun instanceIdentifier(instanceIdentifier: String) {
      cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    public override fun instanceResourceId(instanceResourceId: String) {
      cdkBuilder.instanceResourceId(instanceResourceId)
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.DatabaseInstanceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceAttributes,
  ) : DatabaseInstanceAttributes {
    public override fun engine(): IInstanceEngine? =
        unwrap(this).getEngine()?.let(IInstanceEngine::wrap)

    public override fun instanceEndpointAddress(): String =
        unwrap(this).getInstanceEndpointAddress()

    public override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    public override fun instanceResourceId(): String? = unwrap(this).getInstanceResourceId()

    public override fun port(): Number = unwrap(this).getPort()

    public override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseInstanceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceAttributes):
        DatabaseInstanceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseInstanceAttributes):
        software.amazon.awscdk.services.rds.DatabaseInstanceAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
