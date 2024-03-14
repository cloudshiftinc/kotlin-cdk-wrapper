package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ResultConfiguration {
  public fun encryptionConfiguration(): EncryptionConfiguration? =
      unwrap(this).getEncryptionConfiguration()?.let(EncryptionConfiguration::wrap)

  public fun outputLocation(): Location? = unwrap(this).getOutputLocation()?.let(Location::wrap)

  public interface Builder {
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bee7008d40e5551ab7be6c4bf800ba632be586de8e46f75a362658c46ea1196a")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration.Builder.() -> Unit)

    public fun outputLocation(outputLocation: Location)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("946c2aa2db98360f318aef4e7640a30dbef5168659f0b8d99722c1997ca1f670")
    public fun outputLocation(outputLocation: Location.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration.builder()

    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfiguration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bee7008d40e5551ab7be6c4bf800ba632be586de8e46f75a362658c46ea1196a")
    override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfiguration(encryptionConfiguration))

    override fun outputLocation(outputLocation: Location) {
      cdkBuilder.outputLocation(outputLocation.let(Location::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("946c2aa2db98360f318aef4e7640a30dbef5168659f0b8d99722c1997ca1f670")
    override fun outputLocation(outputLocation: Location.Builder.() -> Unit): Unit =
        outputLocation(Location(outputLocation))

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration,
  ) : ResultConfiguration {
    override fun encryptionConfiguration(): EncryptionConfiguration? =
        unwrap(this).getEncryptionConfiguration()?.let(EncryptionConfiguration::wrap)

    override fun outputLocation(): Location? = unwrap(this).getOutputLocation()?.let(Location::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResultConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration):
        ResultConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResultConfiguration):
        software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
