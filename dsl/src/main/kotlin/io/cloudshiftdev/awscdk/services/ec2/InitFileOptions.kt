package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface InitFileOptions {
  /**
   * True if the inlined content (from a string or file) should be treated as base64 encoded.
   *
   * Only applicable for inlined string and file content.
   *
   * Default: false
   */
  public fun base64Encoded(): Boolean? = unwrap(this).getBase64Encoded()

  /**
   * The name of the owning group for this file.
   *
   * Not supported for Windows systems.
   *
   * Default: 'root'
   */
  public fun group(): String? = unwrap(this).getGroup()

  /**
   * A six-digit octal value representing the mode for this file.
   *
   * Use the first three digits for symlinks and the last three digits for
   * setting permissions. To create a symlink, specify 120xxx, where xxx
   * defines the permissions of the target file. To specify permissions for a
   * file, use the last three digits, such as 000644.
   *
   * Not supported for Windows systems.
   *
   * Default: '000644'
   */
  public fun mode(): String? = unwrap(this).getMode()

  /**
   * The name of the owning user for this file.
   *
   * Not supported for Windows systems.
   *
   * Default: 'root'
   */
  public fun owner(): String? = unwrap(this).getOwner()

  /**
   * Restart the given service after this file has been written.
   *
   * Default: - Do not restart any service
   */
  public fun serviceRestartHandles(): List<InitServiceRestartHandle> =
      unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

  /**
   * A builder for [InitFileOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param base64Encoded True if the inlined content (from a string or file) should be treated as
     * base64 encoded.
     * Only applicable for inlined string and file content.
     */
    public fun base64Encoded(base64Encoded: Boolean)

    /**
     * @param group The name of the owning group for this file.
     * Not supported for Windows systems.
     */
    public fun group(group: String)

    /**
     * @param mode A six-digit octal value representing the mode for this file.
     * Use the first three digits for symlinks and the last three digits for
     * setting permissions. To create a symlink, specify 120xxx, where xxx
     * defines the permissions of the target file. To specify permissions for a
     * file, use the last three digits, such as 000644.
     *
     * Not supported for Windows systems.
     */
    public fun mode(mode: String)

    /**
     * @param owner The name of the owning user for this file.
     * Not supported for Windows systems.
     */
    public fun owner(owner: String)

    /**
     * @param serviceRestartHandles Restart the given service after this file has been written.
     */
    public fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>)

    /**
     * @param serviceRestartHandles Restart the given service after this file has been written.
     */
    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InitFileOptions.Builder =
        software.amazon.awscdk.services.ec2.InitFileOptions.builder()

    /**
     * @param base64Encoded True if the inlined content (from a string or file) should be treated as
     * base64 encoded.
     * Only applicable for inlined string and file content.
     */
    override fun base64Encoded(base64Encoded: Boolean) {
      cdkBuilder.base64Encoded(base64Encoded)
    }

    /**
     * @param group The name of the owning group for this file.
     * Not supported for Windows systems.
     */
    override fun group(group: String) {
      cdkBuilder.group(group)
    }

    /**
     * @param mode A six-digit octal value representing the mode for this file.
     * Use the first three digits for symlinks and the last three digits for
     * setting permissions. To create a symlink, specify 120xxx, where xxx
     * defines the permissions of the target file. To specify permissions for a
     * file, use the last three digits, such as 000644.
     *
     * Not supported for Windows systems.
     */
    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    /**
     * @param owner The name of the owning user for this file.
     * Not supported for Windows systems.
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * @param serviceRestartHandles Restart the given service after this file has been written.
     */
    override fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>) {
      cdkBuilder.serviceRestartHandles(serviceRestartHandles.map(InitServiceRestartHandle::unwrap))
    }

    /**
     * @param serviceRestartHandles Restart the given service after this file has been written.
     */
    override fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle): Unit
        = serviceRestartHandles(serviceRestartHandles.toList())

    public fun build(): software.amazon.awscdk.services.ec2.InitFileOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InitFileOptions,
  ) : CdkObject(cdkObject), InitFileOptions {
    /**
     * True if the inlined content (from a string or file) should be treated as base64 encoded.
     *
     * Only applicable for inlined string and file content.
     *
     * Default: false
     */
    override fun base64Encoded(): Boolean? = unwrap(this).getBase64Encoded()

    /**
     * The name of the owning group for this file.
     *
     * Not supported for Windows systems.
     *
     * Default: 'root'
     */
    override fun group(): String? = unwrap(this).getGroup()

    /**
     * A six-digit octal value representing the mode for this file.
     *
     * Use the first three digits for symlinks and the last three digits for
     * setting permissions. To create a symlink, specify 120xxx, where xxx
     * defines the permissions of the target file. To specify permissions for a
     * file, use the last three digits, such as 000644.
     *
     * Not supported for Windows systems.
     *
     * Default: '000644'
     */
    override fun mode(): String? = unwrap(this).getMode()

    /**
     * The name of the owning user for this file.
     *
     * Not supported for Windows systems.
     *
     * Default: 'root'
     */
    override fun owner(): String? = unwrap(this).getOwner()

    /**
     * Restart the given service after this file has been written.
     *
     * Default: - Do not restart any service
     */
    override fun serviceRestartHandles(): List<InitServiceRestartHandle> =
        unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InitFileOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitFileOptions):
        InitFileOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitFileOptions):
        software.amazon.awscdk.services.ec2.InitFileOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.InitFileOptions
  }
}
