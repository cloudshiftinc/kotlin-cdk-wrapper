@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class InitCommand internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InitCommand,
) : InitElement(cdkObject) {
  public override fun elementType(): String = unwrap(this).getElementType()

  public companion object {
    public fun argvCommand(argv: List<String>): InitCommand =
        software.amazon.awscdk.services.ec2.InitCommand.argvCommand(argv).let(InitCommand::wrap)

    public fun argvCommand(vararg argv: String): InitCommand = argvCommand(argv.toList())

    public fun argvCommand(argv: List<String>, options: InitCommandOptions): InitCommand =
        software.amazon.awscdk.services.ec2.InitCommand.argvCommand(argv,
        options.let(InitCommandOptions::unwrap)).let(InitCommand::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0c19cbf9eb896fbd54ff7a0bd0819b6bb6ed28b35a7aed77ecdcaae3239f254")
    public fun argvCommand(argv: List<String>, options: InitCommandOptions.Builder.() -> Unit):
        InitCommand = argvCommand(argv, InitCommandOptions(options))

    public fun shellCommand(shellCommand: String): InitCommand =
        software.amazon.awscdk.services.ec2.InitCommand.shellCommand(shellCommand).let(InitCommand::wrap)

    public fun shellCommand(shellCommand: String, options: InitCommandOptions): InitCommand =
        software.amazon.awscdk.services.ec2.InitCommand.shellCommand(shellCommand,
        options.let(InitCommandOptions::unwrap)).let(InitCommand::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb1d0fcbe5c0edf66553efc370b400bcec713ffa9e0140d8cfb97aabd109e1fb")
    public fun shellCommand(shellCommand: String, options: InitCommandOptions.Builder.() -> Unit):
        InitCommand = shellCommand(shellCommand, InitCommandOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitCommand): InitCommand =
        InitCommand(cdkObject)

    internal fun unwrap(wrapped: InitCommand): software.amazon.awscdk.services.ec2.InitCommand =
        wrapped.cdkObject
  }
}
