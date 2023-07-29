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

package cloudshift.awscdk.dsl.services.sdb

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sdb.CfnDomain
import software.amazon.awscdk.services.sdb.CfnDomainProps
import software.constructs.Construct

public object sdb {
    /**
     * Use the `AWS::SDB::Domain` resource to declare a SimpleDB domain.
     *
     * When you specify `AWS::SDB::Domain` as an argument in a `Ref` function, AWS CloudFormation
     * returns the value of the `DomainName` .
     *
     * The `AWS::SDB::Domain` resource does not allow any updates, including metadata updates.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sdb.*;
     * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html)
     */
    public inline fun cfnDomain(
        scope: Construct,
        id: String,
        block: CfnDomainDsl.() -> Unit = {},
    ): CfnDomain {
        val builder = CfnDomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDomain`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sdb.*;
     * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html)
     */
    public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
        val builder = CfnDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
