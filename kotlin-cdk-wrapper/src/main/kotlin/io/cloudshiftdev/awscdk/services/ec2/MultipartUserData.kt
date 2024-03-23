@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Mime multipart user data.
 *
 * This class represents MIME multipart user data, as described in.
 * [Specifying Multiple User Data Blocks Using a MIME Multi Part
 * Archive](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#multi-part_user_data)
 *
 * Example:
 *
 * ```
 * UserData bootHookConf = UserData.forLinux();
 * bootHookConf.addCommands("cloud-init-per once docker_options echo
 * 'OPTIONS=\"${OPTIONS} --storage-opt dm.basesize=40G\"' &gt;&gt; /etc/sysconfig/docker");
 * UserData setupCommands = UserData.forLinux();
 * setupCommands.addCommands("sudo yum install awscli &amp;&amp; echo Packages installed らと &gt;
 * /var/tmp/setup");
 * MultipartUserData multipartUserData = new MultipartUserData();
 * // The docker has to be configured at early stage, so content type is overridden to boothook
 * multipartUserData.addPart(MultipartBody.fromUserData(bootHookConf, "text/cloud-boothook;
 * charset=\"us-ascii\""));
 * // Execute the rest of setup
 * multipartUserData.addPart(MultipartBody.fromUserData(setupCommands));
 * LaunchTemplate.Builder.create(this, "")
 * .userData(multipartUserData)
 * .blockDevices(List.of())
 * .build();
 * ```
 */
public open class MultipartUserData(
  cdkObject: software.amazon.awscdk.services.ec2.MultipartUserData,
) : UserData(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.ec2.MultipartUserData()
  )

  public constructor(opts: MultipartUserDataOptions) :
      this(software.amazon.awscdk.services.ec2.MultipartUserData(opts.let(MultipartUserDataOptions::unwrap))
  )

  public constructor(opts: MultipartUserDataOptions.Builder.() -> Unit) :
      this(MultipartUserDataOptions(opts)
  )

  /**
   * Add one or more commands to the user data.
   *
   * @param commands 
   */
  public override fun addCommands(vararg commands: String) {
    unwrap(this).addCommands(*commands)
  }

  /**
   * Adds commands to execute a file.
   *
   * @param params 
   */
  public override fun addExecuteFileCommand(params: ExecuteFileOptions) {
    unwrap(this).addExecuteFileCommand(params.let(ExecuteFileOptions::unwrap))
  }

  /**
   * Adds commands to execute a file.
   *
   * @param params 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b557a6f4a2ca15b71d1150c77bb51fd8c3435694ec30126636099a14c197a4fd")
  public override fun addExecuteFileCommand(params: ExecuteFileOptions.Builder.() -> Unit): Unit =
      addExecuteFileCommand(ExecuteFileOptions(params))

  /**
   * Add one or more commands to the user data that will run when the script exits.
   *
   * @param commands 
   */
  public override fun addOnExitCommands(vararg commands: String) {
    unwrap(this).addOnExitCommands(*commands)
  }

  /**
   * Adds a part to the list of parts.
   *
   * @param part 
   */
  public open fun addPart(part: MultipartBody) {
    unwrap(this).addPart(part.let(MultipartBody::unwrap))
  }

  /**
   * Adds commands to download a file from S3.
   *
   * @param params 
   */
  public override fun addS3DownloadCommand(params: S3DownloadOptions): String =
      unwrap(this).addS3DownloadCommand(params.let(S3DownloadOptions::unwrap))

  /**
   * Adds commands to download a file from S3.
   *
   * @param params 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca5291b6617557daf5643d9f19e97f8894451b651dc29154159b383765d7c98b")
  public override fun addS3DownloadCommand(params: S3DownloadOptions.Builder.() -> Unit): String =
      addS3DownloadCommand(S3DownloadOptions(params))

  /**
   * Adds a command which will send a cfn-signal when the user data script ends.
   *
   * @param resource 
   */
  public override fun addSignalOnExitCommand(resource: Resource) {
    unwrap(this).addSignalOnExitCommand(resource.let(Resource::unwrap))
  }

  /**
   * Adds a multipart part based on a UserData object.
   *
   * If `makeDefault` is true, then the UserData added by this method
   * will also be the target of calls to the `add*Command` methods on
   * this MultipartUserData object.
   *
   * If `makeDefault` is false, then this is the same as calling:
   *
   * ```
   * MultipartUserData multiPart;
   * UserData userData;
   * String contentType;
   * multiPart.addPart(MultipartBody.fromUserData(userData, contentType));
   * ```
   *
   * An undefined `makeDefault` defaults to either:
   *
   * * `true` if no default UserData has been set yet; or
   * * `false` if there is no default UserData set.
   *
   * @param userData 
   * @param contentType
   * @param makeDefault
   */
  public open fun addUserDataPart(userData: UserData) {
    unwrap(this).addUserDataPart(userData.let(UserData::unwrap))
  }

  /**
   * Adds a multipart part based on a UserData object.
   *
   * If `makeDefault` is true, then the UserData added by this method
   * will also be the target of calls to the `add*Command` methods on
   * this MultipartUserData object.
   *
   * If `makeDefault` is false, then this is the same as calling:
   *
   * ```
   * MultipartUserData multiPart;
   * UserData userData;
   * String contentType;
   * multiPart.addPart(MultipartBody.fromUserData(userData, contentType));
   * ```
   *
   * An undefined `makeDefault` defaults to either:
   *
   * * `true` if no default UserData has been set yet; or
   * * `false` if there is no default UserData set.
   *
   * @param userData 
   * @param contentType
   * @param makeDefault
   */
  public open fun addUserDataPart(userData: UserData, contentType: String) {
    unwrap(this).addUserDataPart(userData.let(UserData::unwrap), contentType)
  }

  /**
   * Adds a multipart part based on a UserData object.
   *
   * If `makeDefault` is true, then the UserData added by this method
   * will also be the target of calls to the `add*Command` methods on
   * this MultipartUserData object.
   *
   * If `makeDefault` is false, then this is the same as calling:
   *
   * ```
   * MultipartUserData multiPart;
   * UserData userData;
   * String contentType;
   * multiPart.addPart(MultipartBody.fromUserData(userData, contentType));
   * ```
   *
   * An undefined `makeDefault` defaults to either:
   *
   * * `true` if no default UserData has been set yet; or
   * * `false` if there is no default UserData set.
   *
   * @param userData 
   * @param contentType
   * @param makeDefault
   */
  public open fun addUserDataPart(
    userData: UserData,
    contentType: String,
    makeDefault: Boolean,
  ) {
    unwrap(this).addUserDataPart(userData.let(UserData::unwrap), contentType, makeDefault)
  }

  /**
   * Render the UserData for use in a construct.
   */
  public override fun render(): String = unwrap(this).render()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.MultipartUserData].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The string used to separate parts in multipart user data archive (it's like MIME boundary).
     *
     * This string should contain [a-zA-Z0-9()+,-./:=?] characters only, and should not be present
     * in any part, or in text content of archive.
     *
     * Default: `+AWS+CDK+User+Data+Separator==`
     *
     * @param partsSeparator The string used to separate parts in multipart user data archive (it's
     * like MIME boundary). 
     */
    public fun partsSeparator(partsSeparator: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.MultipartUserData.Builder =
        software.amazon.awscdk.services.ec2.MultipartUserData.Builder.create()

    /**
     * The string used to separate parts in multipart user data archive (it's like MIME boundary).
     *
     * This string should contain [a-zA-Z0-9()+,-./:=?] characters only, and should not be present
     * in any part, or in text content of archive.
     *
     * Default: `+AWS+CDK+User+Data+Separator==`
     *
     * @param partsSeparator The string used to separate parts in multipart user data archive (it's
     * like MIME boundary). 
     */
    override fun partsSeparator(partsSeparator: String) {
      cdkBuilder.partsSeparator(partsSeparator)
    }

    public fun build(): software.amazon.awscdk.services.ec2.MultipartUserData = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MultipartUserData {
      val builderImpl = BuilderImpl()
      return MultipartUserData(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.MultipartUserData):
        MultipartUserData = MultipartUserData(cdkObject)

    internal fun unwrap(wrapped: MultipartUserData):
        software.amazon.awscdk.services.ec2.MultipartUserData = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.MultipartUserData
  }
}
