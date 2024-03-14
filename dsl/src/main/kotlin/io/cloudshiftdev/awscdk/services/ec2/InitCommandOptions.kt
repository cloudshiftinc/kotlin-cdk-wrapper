package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface InitCommandOptions {
  /**
   * The working directory.
   *
   * Default: - Use default working directory
   */
  public fun cwd(): String? = unwrap(this).getCwd()

  /**
   * Sets environment variables for the command.
   *
   * This property overwrites, rather than appends, the existing environment.
   *
   * Default: - Use current environment
   */
  public fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

  /**
   * Continue running if this command fails.
   *
   * Default: false
   */
  public fun ignoreErrors(): Boolean? = unwrap(this).getIgnoreErrors()

  /**
   * Identifier key for this command.
   *
   * Commands are executed in lexicographical order of their key names.
   *
   * Default: - Automatically generated based on index
   */
  public fun key(): String? = unwrap(this).getKey()

  /**
   * Restart the given service(s) after this command has run.
   *
   * Default: - Do not restart any service
   */
  public fun serviceRestartHandles(): List<InitServiceRestartHandle> =
      unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

  /**
   * Command to determine whether this command should be run.
   *
   * If the test passes (exits with error code of 0), the command is run.
   *
   * Default: - Always run the command
   */
  public fun testCmd(): String? = unwrap(this).getTestCmd()

  /**
   * The duration to wait after a command has finished in case the command causes a reboot.
   *
   * Set this value to `InitCommandWaitDuration.none()` if you do not want to wait for every
   * command;
   * `InitCommandWaitDuration.forever()` directs cfn-init to exit and resume only after the reboot
   * is complete.
   *
   * For Windows systems only.
   *
   * Default: - 60 seconds
   */
  public fun waitAfterCompletion(): InitCommandWaitDuration? =
      unwrap(this).getWaitAfterCompletion()?.let(InitCommandWaitDuration::wrap)

  /**
   * A builder for [InitCommandOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cwd The working directory.
     */
    public fun cwd(cwd: String)

    /**
     * @param env Sets environment variables for the command.
     * This property overwrites, rather than appends, the existing environment.
     */
    public fun env(env: Map<String, String>)

    /**
     * @param ignoreErrors Continue running if this command fails.
     */
    public fun ignoreErrors(ignoreErrors: Boolean)

    /**
     * @param key Identifier key for this command.
     * Commands are executed in lexicographical order of their key names.
     */
    public fun key(key: String)

    /**
     * @param serviceRestartHandles Restart the given service(s) after this command has run.
     */
    public fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>)

    /**
     * @param serviceRestartHandles Restart the given service(s) after this command has run.
     */
    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle)

    /**
     * @param testCmd Command to determine whether this command should be run.
     * If the test passes (exits with error code of 0), the command is run.
     */
    public fun testCmd(testCmd: String)

    /**
     * @param waitAfterCompletion The duration to wait after a command has finished in case the
     * command causes a reboot.
     * Set this value to `InitCommandWaitDuration.none()` if you do not want to wait for every
     * command;
     * `InitCommandWaitDuration.forever()` directs cfn-init to exit and resume only after the reboot
     * is complete.
     *
     * For Windows systems only.
     */
    public fun waitAfterCompletion(waitAfterCompletion: InitCommandWaitDuration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InitCommandOptions.Builder =
        software.amazon.awscdk.services.ec2.InitCommandOptions.builder()

    /**
     * @param cwd The working directory.
     */
    override fun cwd(cwd: String) {
      cdkBuilder.cwd(cwd)
    }

    /**
     * @param env Sets environment variables for the command.
     * This property overwrites, rather than appends, the existing environment.
     */
    override fun env(env: Map<String, String>) {
      cdkBuilder.env(env)
    }

    /**
     * @param ignoreErrors Continue running if this command fails.
     */
    override fun ignoreErrors(ignoreErrors: Boolean) {
      cdkBuilder.ignoreErrors(ignoreErrors)
    }

    /**
     * @param key Identifier key for this command.
     * Commands are executed in lexicographical order of their key names.
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param serviceRestartHandles Restart the given service(s) after this command has run.
     */
    override fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>) {
      cdkBuilder.serviceRestartHandles(serviceRestartHandles.map(InitServiceRestartHandle::unwrap))
    }

    /**
     * @param serviceRestartHandles Restart the given service(s) after this command has run.
     */
    override fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle): Unit
        = serviceRestartHandles(serviceRestartHandles.toList())

    /**
     * @param testCmd Command to determine whether this command should be run.
     * If the test passes (exits with error code of 0), the command is run.
     */
    override fun testCmd(testCmd: String) {
      cdkBuilder.testCmd(testCmd)
    }

    /**
     * @param waitAfterCompletion The duration to wait after a command has finished in case the
     * command causes a reboot.
     * Set this value to `InitCommandWaitDuration.none()` if you do not want to wait for every
     * command;
     * `InitCommandWaitDuration.forever()` directs cfn-init to exit and resume only after the reboot
     * is complete.
     *
     * For Windows systems only.
     */
    override fun waitAfterCompletion(waitAfterCompletion: InitCommandWaitDuration) {
      cdkBuilder.waitAfterCompletion(waitAfterCompletion.let(InitCommandWaitDuration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.InitCommandOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InitCommandOptions,
  ) : CdkObject(cdkObject), InitCommandOptions {
    /**
     * The working directory.
     *
     * Default: - Use default working directory
     */
    override fun cwd(): String? = unwrap(this).getCwd()

    /**
     * Sets environment variables for the command.
     *
     * This property overwrites, rather than appends, the existing environment.
     *
     * Default: - Use current environment
     */
    override fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

    /**
     * Continue running if this command fails.
     *
     * Default: false
     */
    override fun ignoreErrors(): Boolean? = unwrap(this).getIgnoreErrors()

    /**
     * Identifier key for this command.
     *
     * Commands are executed in lexicographical order of their key names.
     *
     * Default: - Automatically generated based on index
     */
    override fun key(): String? = unwrap(this).getKey()

    /**
     * Restart the given service(s) after this command has run.
     *
     * Default: - Do not restart any service
     */
    override fun serviceRestartHandles(): List<InitServiceRestartHandle> =
        unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

    /**
     * Command to determine whether this command should be run.
     *
     * If the test passes (exits with error code of 0), the command is run.
     *
     * Default: - Always run the command
     */
    override fun testCmd(): String? = unwrap(this).getTestCmd()

    /**
     * The duration to wait after a command has finished in case the command causes a reboot.
     *
     * Set this value to `InitCommandWaitDuration.none()` if you do not want to wait for every
     * command;
     * `InitCommandWaitDuration.forever()` directs cfn-init to exit and resume only after the reboot
     * is complete.
     *
     * For Windows systems only.
     *
     * Default: - 60 seconds
     */
    override fun waitAfterCompletion(): InitCommandWaitDuration? =
        unwrap(this).getWaitAfterCompletion()?.let(InitCommandWaitDuration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InitCommandOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitCommandOptions):
        InitCommandOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitCommandOptions):
        software.amazon.awscdk.services.ec2.InitCommandOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.InitCommandOptions
  }
}
