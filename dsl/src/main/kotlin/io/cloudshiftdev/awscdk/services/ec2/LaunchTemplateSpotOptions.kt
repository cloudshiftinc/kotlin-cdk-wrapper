package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Expiration
import kotlin.Number
import kotlin.Unit

public interface LaunchTemplateSpotOptions {
  public fun blockDuration(): Duration? = unwrap(this).getBlockDuration()?.let(Duration::wrap)

  public fun interruptionBehavior(): SpotInstanceInterruption? =
      unwrap(this).getInterruptionBehavior()?.let(SpotInstanceInterruption::wrap)

  public fun maxPrice(): Number? = unwrap(this).getMaxPrice()

  public fun requestType(): SpotRequestType? =
      unwrap(this).getRequestType()?.let(SpotRequestType::wrap)

  public fun validUntil(): Expiration? = unwrap(this).getValidUntil()?.let(Expiration::wrap)

  public interface Builder {
    public fun blockDuration(blockDuration: Duration)

    public fun interruptionBehavior(interruptionBehavior: SpotInstanceInterruption)

    public fun maxPrice(maxPrice: Number)

    public fun requestType(requestType: SpotRequestType)

    public fun validUntil(validUntil: Expiration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions.Builder =
        software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions.builder()

    override fun blockDuration(blockDuration: Duration) {
      cdkBuilder.blockDuration(blockDuration.let(Duration::unwrap))
    }

    override fun interruptionBehavior(interruptionBehavior: SpotInstanceInterruption) {
      cdkBuilder.interruptionBehavior(interruptionBehavior.let(SpotInstanceInterruption::unwrap))
    }

    override fun maxPrice(maxPrice: Number) {
      cdkBuilder.maxPrice(maxPrice)
    }

    override fun requestType(requestType: SpotRequestType) {
      cdkBuilder.requestType(requestType.let(SpotRequestType::unwrap))
    }

    override fun validUntil(validUntil: Expiration) {
      cdkBuilder.validUntil(validUntil.let(Expiration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions,
  ) : LaunchTemplateSpotOptions {
    override fun blockDuration(): Duration? = unwrap(this).getBlockDuration()?.let(Duration::wrap)

    override fun interruptionBehavior(): SpotInstanceInterruption? =
        unwrap(this).getInterruptionBehavior()?.let(SpotInstanceInterruption::wrap)

    override fun maxPrice(): Number? = unwrap(this).getMaxPrice()

    override fun requestType(): SpotRequestType? =
        unwrap(this).getRequestType()?.let(SpotRequestType::wrap)

    override fun validUntil(): Expiration? = unwrap(this).getValidUntil()?.let(Expiration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateSpotOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions):
        LaunchTemplateSpotOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplateSpotOptions):
        software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions = (wrapped as
        Wrapper).cdkObject
  }
}
