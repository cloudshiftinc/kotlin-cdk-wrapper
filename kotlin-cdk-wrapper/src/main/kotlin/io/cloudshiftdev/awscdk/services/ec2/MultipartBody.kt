@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The base class for all classes which can be used as `MultipartUserData`.
 *
 * Example:
 *
 * ```
 * MultipartUserData multipartUserData = new MultipartUserData();
 * UserData commandsUserData = UserData.forLinux();
 * multipartUserData.addUserDataPart(commandsUserData, MultipartBody.SHELL_SCRIPT, true);
 * // Adding commands to the multipartUserData adds them to commandsUserData, and vice-versa.
 * multipartUserData.addCommands("touch /root/multi.txt");
 * commandsUserData.addCommands("touch /root/userdata.txt");
 * ```
 */
public abstract class MultipartBody(
  cdkObject: software.amazon.awscdk.services.ec2.MultipartBody,
) : CdkObject(cdkObject) {
  /**
   * Render body part as the string.
   *
   * Subclasses should not add leading nor trailing new line characters (\r \n)
   */
  public open fun renderBodyPart(): List<String> = unwrap(this).renderBodyPart()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.MultipartBody,
  ) : MultipartBody(cdkObject)

  public companion object {
    public val CLOUD_BOOTHOOK: String =
        software.amazon.awscdk.services.ec2.MultipartBody.CLOUD_BOOTHOOK

    public val SHELL_SCRIPT: String = software.amazon.awscdk.services.ec2.MultipartBody.SHELL_SCRIPT

    public fun fromRawBody(opts: MultipartBodyOptions): MultipartBody =
        software.amazon.awscdk.services.ec2.MultipartBody.fromRawBody(opts.let(MultipartBodyOptions::unwrap)).let(MultipartBody::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54f5c817affa2ea65b6f6e9daed61c40a521ab0a2012d40d517e7d3debe1b445")
    public fun fromRawBody(opts: MultipartBodyOptions.Builder.() -> Unit): MultipartBody =
        fromRawBody(MultipartBodyOptions(opts))

    public fun fromUserData(userData: UserData): MultipartBody =
        software.amazon.awscdk.services.ec2.MultipartBody.fromUserData(userData.let(UserData::unwrap)).let(MultipartBody::wrap)

    public fun fromUserData(userData: UserData, contentType: String): MultipartBody =
        software.amazon.awscdk.services.ec2.MultipartBody.fromUserData(userData.let(UserData::unwrap),
        contentType).let(MultipartBody::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.MultipartBody): MultipartBody =
        CdkObjectWrappers.wrap(cdkObject) as? MultipartBody ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MultipartBody): software.amazon.awscdk.services.ec2.MultipartBody =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.MultipartBody
  }
}
