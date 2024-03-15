@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Optional parameters used when creating a user.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * InitUserOptions initUserOptions = InitUserOptions.builder()
 * .groups(List.of("groups"))
 * .homeDir("homeDir")
 * .userId(123)
 * .build();
 * ```
 */
public interface InitUserOptions {
  /**
   * A list of group names.
   *
   * The user will be added to each group in the list.
   *
   * Default: the user is not associated with any groups.
   */
  public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  /**
   * The user's home directory.
   *
   * Default: assigned by the OS
   */
  public fun homeDir(): String? = unwrap(this).getHomeDir()

  /**
   * A user ID.
   *
   * The creation process fails if the user name exists with a different user ID.
   * If the user ID is already assigned to an existing user the operating system may
   * reject the creation request.
   *
   * Default: assigned by the OS
   */
  public fun userId(): Number? = unwrap(this).getUserId()

  /**
   * A builder for [InitUserOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param groups A list of group names.
     * The user will be added to each group in the list.
     */
    public fun groups(groups: List<String>)

    /**
     * @param groups A list of group names.
     * The user will be added to each group in the list.
     */
    public fun groups(vararg groups: String)

    /**
     * @param homeDir The user's home directory.
     */
    public fun homeDir(homeDir: String)

    /**
     * @param userId A user ID.
     * The creation process fails if the user name exists with a different user ID.
     * If the user ID is already assigned to an existing user the operating system may
     * reject the creation request.
     */
    public fun userId(userId: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InitUserOptions.Builder =
        software.amazon.awscdk.services.ec2.InitUserOptions.builder()

    /**
     * @param groups A list of group names.
     * The user will be added to each group in the list.
     */
    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    /**
     * @param groups A list of group names.
     * The user will be added to each group in the list.
     */
    override fun groups(vararg groups: String): Unit = groups(groups.toList())

    /**
     * @param homeDir The user's home directory.
     */
    override fun homeDir(homeDir: String) {
      cdkBuilder.homeDir(homeDir)
    }

    /**
     * @param userId A user ID.
     * The creation process fails if the user name exists with a different user ID.
     * If the user ID is already assigned to an existing user the operating system may
     * reject the creation request.
     */
    override fun userId(userId: Number) {
      cdkBuilder.userId(userId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.InitUserOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InitUserOptions,
  ) : CdkObject(cdkObject), InitUserOptions {
    /**
     * A list of group names.
     *
     * The user will be added to each group in the list.
     *
     * Default: the user is not associated with any groups.
     */
    override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    /**
     * The user's home directory.
     *
     * Default: assigned by the OS
     */
    override fun homeDir(): String? = unwrap(this).getHomeDir()

    /**
     * A user ID.
     *
     * The creation process fails if the user name exists with a different user ID.
     * If the user ID is already assigned to an existing user the operating system may
     * reject the creation request.
     *
     * Default: assigned by the OS
     */
    override fun userId(): Number? = unwrap(this).getUserId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InitUserOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitUserOptions):
        InitUserOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitUserOptions):
        software.amazon.awscdk.services.ec2.InitUserOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.InitUserOptions
  }
}
