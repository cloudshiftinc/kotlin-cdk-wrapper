@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnBuild
import software.constructs.Construct

/**
 * The `AWS::GameLift::Build` resource creates a game server build that is installed and run on
 * instances in an Amazon GameLift fleet.
 *
 * This resource points to an Amazon S3 location that contains a zip file with all of the components
 * of the game server build.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * CfnBuild cfnBuild = CfnBuild.Builder.create(this, "MyCfnBuild")
 * .name("name")
 * .operatingSystem("operatingSystem")
 * .serverSdkVersion("serverSdkVersion")
 * .storageLocation(StorageLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html)
 */
@CdkDslMarker
public class CfnBuildDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBuild.Builder = CfnBuild.Builder.create(scope, id)

    /**
     * A descriptive label that is associated with a build.
     *
     * Build names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-name)
     *
     * @param name A descriptive label that is associated with a build.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The operating system that your game server binaries run on.
     *
     * This value determines the type of fleet resources that you use for this build. If your game
     * build contains multiple executables, they all must run on the same operating system. You must
     * specify a valid operating system in this request. There is no default value. You can't change
     * a build's operating system later.
     *
     * The Amazon Linux 2023 OS is not available in the China Regions. &gt; Support is ending in
     * 2023 for the Windows Server 2012 and Amazon Linux (AL1) operating systems. If you have active
     * fleets using these operating systems, you can continue to create new builds using these until
     * their end of support. All other users must use Windows Server 2016, Amazon Linux 2, or Amazon
     * Linux 2023. For more information, including specific end-of-support dates, see the Amazon
     * GameLift FAQs for [Windows Server](https://docs.aws.amazon.com/gamelift/faq/win2012/) and
     * [Linux Server](https://docs.aws.amazon.com/gamelift/faq/al1/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-operatingsystem)
     *
     * @param operatingSystem The operating system that your game server binaries run on.
     */
    public fun operatingSystem(operatingSystem: String) {
        cdkBuilder.operatingSystem(operatingSystem)
    }

    /**
     * A server SDK version you used when integrating your game server build with Amazon GameLift.
     *
     * For more information see
     * [Integrate games with custom game servers](https://docs.aws.amazon.com/gamelift/latest/developerguide/integration-custom-intro.html)
     * . By default Amazon GameLift sets this value to `4.0.2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-serversdkversion)
     *
     * @param serverSdkVersion A server SDK version you used when integrating your game server build
     *   with Amazon GameLift.
     */
    public fun serverSdkVersion(serverSdkVersion: String) {
        cdkBuilder.serverSdkVersion(serverSdkVersion)
    }

    /**
     * Information indicating where your game build files are stored.
     *
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location
     * must also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon
     * S3 bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift will report a `SizeOnDisk` of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
     *
     * @param storageLocation Information indicating where your game build files are stored.
     */
    public fun storageLocation(storageLocation: IResolvable) {
        cdkBuilder.storageLocation(storageLocation)
    }

    /**
     * Information indicating where your game build files are stored.
     *
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location
     * must also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon
     * S3 bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift will report a `SizeOnDisk` of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
     *
     * @param storageLocation Information indicating where your game build files are stored.
     */
    public fun storageLocation(storageLocation: CfnBuild.StorageLocationProperty) {
        cdkBuilder.storageLocation(storageLocation)
    }

    /**
     * Version information that is associated with this build.
     *
     * Version strings do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-version)
     *
     * @param version Version information that is associated with this build.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnBuild = cdkBuilder.build()
}
