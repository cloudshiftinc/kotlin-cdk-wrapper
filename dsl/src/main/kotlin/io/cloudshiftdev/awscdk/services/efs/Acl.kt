package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface Acl {
  /**
   * Specifies the POSIX group ID to apply to the RootDirectory.
   *
   * Accepts values from 0 to 2^32 (4294967295).
   */
  public fun ownerGid(): String

  /**
   * Specifies the POSIX user ID to apply to the RootDirectory.
   *
   * Accepts values from 0 to 2^32 (4294967295).
   */
  public fun ownerUid(): String

  /**
   * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number
   * representing the file's mode bits.
   */
  public fun permissions(): String

  /**
   * A builder for [Acl]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ownerGid Specifies the POSIX group ID to apply to the RootDirectory. 
     * Accepts values from 0 to 2^32 (4294967295).
     */
    public fun ownerGid(ownerGid: String)

    /**
     * @param ownerUid Specifies the POSIX user ID to apply to the RootDirectory. 
     * Accepts values from 0 to 2^32 (4294967295).
     */
    public fun ownerUid(ownerUid: String)

    /**
     * @param permissions Specifies the POSIX permissions to apply to the RootDirectory, in the
     * format of an octal number representing the file's mode bits. 
     */
    public fun permissions(permissions: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.Acl.Builder =
        software.amazon.awscdk.services.efs.Acl.builder()

    /**
     * @param ownerGid Specifies the POSIX group ID to apply to the RootDirectory. 
     * Accepts values from 0 to 2^32 (4294967295).
     */
    override fun ownerGid(ownerGid: String) {
      cdkBuilder.ownerGid(ownerGid)
    }

    /**
     * @param ownerUid Specifies the POSIX user ID to apply to the RootDirectory. 
     * Accepts values from 0 to 2^32 (4294967295).
     */
    override fun ownerUid(ownerUid: String) {
      cdkBuilder.ownerUid(ownerUid)
    }

    /**
     * @param permissions Specifies the POSIX permissions to apply to the RootDirectory, in the
     * format of an octal number representing the file's mode bits. 
     */
    override fun permissions(permissions: String) {
      cdkBuilder.permissions(permissions)
    }

    public fun build(): software.amazon.awscdk.services.efs.Acl = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.Acl,
  ) : CdkObject(cdkObject), Acl {
    /**
     * Specifies the POSIX group ID to apply to the RootDirectory.
     *
     * Accepts values from 0 to 2^32 (4294967295).
     */
    override fun ownerGid(): String = unwrap(this).getOwnerGid()

    /**
     * Specifies the POSIX user ID to apply to the RootDirectory.
     *
     * Accepts values from 0 to 2^32 (4294967295).
     */
    override fun ownerUid(): String = unwrap(this).getOwnerUid()

    /**
     * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal
     * number representing the file's mode bits.
     */
    override fun permissions(): String = unwrap(this).getPermissions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Acl {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.Acl): Acl = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Acl): software.amazon.awscdk.services.efs.Acl = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.efs.Acl
  }
}
