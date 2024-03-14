package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class InitService internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InitService,
) : InitElement(cdkObject) {
  /**
   * Returns the init element type for this element.
   */
  public override fun elementType(): String = unwrap(this).getElementType()

  public companion object {
    public fun disable(serviceName: String): InitService =
        software.amazon.awscdk.services.ec2.InitService.disable(serviceName).let(InitService::wrap)

    public fun enable(serviceName: String): InitService =
        software.amazon.awscdk.services.ec2.InitService.enable(serviceName).let(InitService::wrap)

    public fun enable(serviceName: String, options: InitServiceOptions): InitService =
        software.amazon.awscdk.services.ec2.InitService.enable(serviceName,
        options.let(InitServiceOptions::unwrap)).let(InitService::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10bbc0c71562733d4b9a50998191a25878d7052cdaf06c2ca0587057e675eaa4")
    public fun enable(serviceName: String, options: InitServiceOptions.Builder.() -> Unit):
        InitService = enable(serviceName, InitServiceOptions(options))

    public fun systemdConfigFile(serviceName: String, options: SystemdConfigFileOptions): InitFile =
        software.amazon.awscdk.services.ec2.InitService.systemdConfigFile(serviceName,
        options.let(SystemdConfigFileOptions::unwrap)).let(InitFile::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94f4c1fe20f9f8f0e59c6c286975e52200644f0f4c93a57d9a76f59085948606")
    public fun systemdConfigFile(serviceName: String,
        options: SystemdConfigFileOptions.Builder.() -> Unit): InitFile =
        systemdConfigFile(serviceName, SystemdConfigFileOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitService): InitService =
        InitService(cdkObject)

    internal fun unwrap(wrapped: InitService): software.amazon.awscdk.services.ec2.InitService =
        wrapped.cdkObject
  }
}
