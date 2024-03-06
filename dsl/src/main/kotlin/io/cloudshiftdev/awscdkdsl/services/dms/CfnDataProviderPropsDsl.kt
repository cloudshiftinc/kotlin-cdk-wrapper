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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnDataProvider
import software.amazon.awscdk.services.dms.CfnDataProviderProps

/**
 * Properties for defining a `CfnDataProvider`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * CfnDataProviderProps cfnDataProviderProps = CfnDataProviderProps.builder()
 * .engine("engine")
 * // the properties below are optional
 * .dataProviderIdentifier("dataProviderIdentifier")
 * .dataProviderName("dataProviderName")
 * .description("description")
 * .exactSettings(false)
 * .settings(SettingsProperty.builder()
 * .postgreSqlSettings(PostgreSqlSettingsProperty.builder()
 * .certificateArn("certificateArn")
 * .databaseName("databaseName")
 * .port(123)
 * .serverName("serverName")
 * .sslMode("sslMode")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-dataprovider.html)
 */
@CdkDslMarker
public class CfnDataProviderPropsDsl {
    private val cdkBuilder: CfnDataProviderProps.Builder = CfnDataProviderProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param dataProviderIdentifier The identifier of the data provider. Identifiers must begin
     *   with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with
     *   a hyphen, or contain two consecutive hyphens.
     */
    public fun dataProviderIdentifier(dataProviderIdentifier: String) {
        cdkBuilder.dataProviderIdentifier(dataProviderIdentifier)
    }

    /** @param dataProviderName The name of the data provider. */
    public fun dataProviderName(dataProviderName: String) {
        cdkBuilder.dataProviderName(dataProviderName)
    }

    /**
     * @param description A description of the data provider. Descriptions can have up to 31
     *   characters. A description can contain only ASCII letters, digits, and hyphens ('-'). Also,
     *   it can't end with a hyphen or contain two consecutive hyphens, and can only begin with a
     *   letter.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param engine The type of database engine for the data provider. Valid values include
     *   `"aurora"` , `"aurora-postgresql"` , `"mysql"` , `"oracle"` , `"postgres"` , `"sqlserver"`
     *   , `redshift` , `mariadb` , `mongodb` , and `docdb` . A value of `"aurora"` represents
     *   Amazon Aurora MySQL-Compatible Edition.
     */
    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    /** @param exactSettings The property describes the exact settings which can be modified. */
    public fun exactSettings(exactSettings: Boolean) {
        cdkBuilder.exactSettings(exactSettings)
    }

    /** @param exactSettings The property describes the exact settings which can be modified. */
    public fun exactSettings(exactSettings: IResolvable) {
        cdkBuilder.exactSettings(exactSettings)
    }

    /** @param settings The settings in JSON format for a data provider. */
    public fun settings(settings: IResolvable) {
        cdkBuilder.settings(settings)
    }

    /** @param settings The settings in JSON format for a data provider. */
    public fun settings(settings: CfnDataProvider.SettingsProperty) {
        cdkBuilder.settings(settings)
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDataProviderProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
