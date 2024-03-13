package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface ArnComponents {
  public fun account(): String? = unwrap(this).getAccount()

  public fun arnFormat(): ArnFormat? = unwrap(this).getArnFormat()?.let(ArnFormat::wrap)

  public fun partition(): String? = unwrap(this).getPartition()

  public fun region(): String? = unwrap(this).getRegion()

  public fun resource(): String

  public fun resourceName(): String? = unwrap(this).getResourceName()

  public fun service(): String

  public interface Builder {
    public fun account(account: String) {
    }

    public fun arnFormat(arnFormat: ArnFormat) {
    }

    public fun partition(partition: String) {
    }

    public fun region(region: String) {
    }

    public fun resource(resource: String) {
    }

    public fun resourceName(resourceName: String) {
    }

    public fun service(service: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ArnComponents.Builder =
        software.amazon.awscdk.ArnComponents.builder()

    public override fun account(account: String) {
      cdkBuilder.account(account)
    }

    public override fun arnFormat(arnFormat: ArnFormat) {
      cdkBuilder.arnFormat(arnFormat.let(ArnFormat::unwrap))
    }

    public override fun partition(partition: String) {
      cdkBuilder.partition(partition)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun resource(resource: String) {
      cdkBuilder.resource(resource)
    }

    public override fun resourceName(resourceName: String) {
      cdkBuilder.resourceName(resourceName)
    }

    public override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public fun build(): software.amazon.awscdk.ArnComponents = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ArnComponents,
  ) : ArnComponents {
    public override fun account(): String? = unwrap(this).getAccount()

    public override fun arnFormat(): ArnFormat? = unwrap(this).getArnFormat()?.let(ArnFormat::wrap)

    public override fun partition(): String? = unwrap(this).getPartition()

    public override fun region(): String? = unwrap(this).getRegion()

    public override fun resource(): String = unwrap(this).getResource()

    public override fun resourceName(): String? = unwrap(this).getResourceName()

    public override fun service(): String = unwrap(this).getService()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ArnComponents {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ArnComponents): ArnComponents =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ArnComponents): software.amazon.awscdk.ArnComponents = (wrapped as
        Wrapper).cdkObject
  }
}
