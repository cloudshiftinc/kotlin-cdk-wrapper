@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.MultipartUserData

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
@CdkDslMarker
public class MultipartUserDataDsl {
  private val cdkBuilder: MultipartUserData.Builder = MultipartUserData.Builder.create()

  /**
   * The string used to separate parts in multipart user data archive (it's like MIME boundary).
   *
   * This string should contain [a-zA-Z0-9()+,-./:=?] characters only, and should not be present in
   * any part, or in text content of archive.
   *
   * Default: `+AWS+CDK+User+Data+Separator==`
   *
   * @param partsSeparator The string used to separate parts in multipart user data archive (it's
   * like MIME boundary). 
   */
  public fun partsSeparator(partsSeparator: String) {
    cdkBuilder.partsSeparator(partsSeparator)
  }

  public fun build(): MultipartUserData = cdkBuilder.build()
}
